package com.web.club3.controller;

import com.web.club3.dto.BookDTO;
import com.web.club3.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    private final BookServiceImpl bookService;
    private final AuthorServiceImpl authorService;
    private final GenreServiceImpl genreService;
    private final BookOrderServiceImpl bookOrderService;
    private final UserServiceImpl userService;

    @Autowired
    public BookController(BookServiceImpl bookService, AuthorServiceImpl authorService, GenreServiceImpl genreService, BookOrderServiceImpl bookOrderService, UserServiceImpl userService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.genreService = genreService;
        this.bookOrderService = bookOrderService;
        this.userService = userService;
    }

  /*  @RequestMapping(method = RequestMethod.GET)
    public String showBookPage() {
        return "book/book";
    }*/

    @GetMapping("/all")
    public String showAllBooks(Model model) {
        List<BookDTO> books = bookService.findAll();
        model.addAttribute("bookModel", books);
        return "/book/all";
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable int id, Model model) {
        BookDTO book = bookService.findById(id);
        if (book == null) return "redirect:/book/all";
        model.addAttribute("bookModel", bookService.findById(id));
        model.addAttribute("isAvailable", bookService.available(id));
        model.addAttribute("avgTimeOfReading", bookOrderService.averageTimeOfReadingBook(id));
        return "/book/book";
    }

    @GetMapping("/create")
    public String createBook(Model model) {
        model.addAttribute("genre", genreService.findAll());
        model.addAttribute("authors", authorService.findAll());
        model.addAttribute("createBook", new BookDTO());
        return "/book/createBook";
    }

    @PostMapping("/create")
    public String createNewBook(@ModelAttribute("createBook") BookDTO bookDTO) {
        bookService.create(bookDTO);
        return "redirect:/book/all";
    }

    @GetMapping("/bookStatistic")
    public String bookStatistic(Model model) {
        String list = bookOrderService.fromTheMostPopularToTheLessPopularBook(LocalDate.of(2021, 1, 1), LocalDate.now());
        final StringBuilder sb = new StringBuilder(list.length());
        for (int i = 0; i < list.length(); i++) {
            final char c = list.charAt(i);
            if (c > 47 && c < 58) {
                sb.append(c);
            }
        }
        LinkedHashMap<BookDTO, Integer> resultList = new LinkedHashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            resultList.put(bookService.findById(Integer.parseInt(String.valueOf(sb.charAt(i)))), i++);
        }
        model.addAttribute("statistic", resultList);
        return "/book/bookStatistic";
    }
}
