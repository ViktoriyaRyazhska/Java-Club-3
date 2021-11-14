package com.web.club3.controller;

import com.web.club3.model.Author;
import com.web.club3.model.Book;
import com.web.club3.service.impl.AuthorServiceImpl;
import com.web.club3.service.impl.BookServiceImpl;
import com.web.club3.service.impl.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/book")
public class BookController {
    private final BookServiceImpl bookService;
    private final AuthorServiceImpl authorService;
    private final GenreServiceImpl genreService;

    @Autowired
    public BookController(BookServiceImpl bookService, AuthorServiceImpl authorService, GenreServiceImpl genreService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.genreService = genreService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showBookPage() {
        return "book/book";
    }

    @GetMapping("/all")
    public String showAllBooks(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("bookModel", books);
        return "/book/all";
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable int id, Model model) {
        Book book = bookService.findById(id);
        if (book == null) return "redirect:/book/all";
        model.addAttribute("bookModel", bookService.findById(id));
        return "/book/book";
    }

    @GetMapping("/create")
    public String createBook(Model model) {
        model.addAttribute("createBook", new Book());
        model.addAttribute("authors", authorService.findAll());
        model.addAttribute("genre", genreService.findAll());
        return "/book/create";
    }

    @PostMapping("/create")
    public String createBook(@ModelAttribute("createBook") @Valid Book request, BindingResult result) {
        if (result.hasErrors()) {
            return "/book/create";
        }
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setGenre(request.getGenre());
        book.setCopies(request.getCopies());
        bookService.create(book);
        return "redirect:/book/" + book.getId();
    }
}
