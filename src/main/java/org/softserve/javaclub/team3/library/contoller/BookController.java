package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.dto.BookDto;
import org.softserve.javaclub.team3.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookService bookServiceImpl;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ModelAndView getAllBooks() {
        ModelAndView modelAndView = new ModelAndView("books");
        modelAndView.addObject("books", bookServiceImpl.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/books/{bookId}", method = RequestMethod.GET)
    public ModelAndView getBookById(@PathVariable int bookId) {
        ModelAndView modelAndView = new ModelAndView("book");
        modelAndView.addObject("book", bookServiceImpl.findById(bookId));
        return modelAndView;
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public String addBook(Model model) {
        model.addAttribute("bookDto", new BookDto());
        return "add-book";
    }

    @ResponseBody
    @RequestMapping(path = "/addBook", method = RequestMethod.POST)
    public void processAddBook(@ModelAttribute("bookDto") BookDto bookDto, BindingResult bindingResult) {
        bookServiceImpl.addBook(bookDto);
    }

    @ResponseBody
    @RequestMapping(value = "books/delete/{bookId}", method = RequestMethod.GET)
    public void deleteBook(@PathVariable int bookId) {
        bookServiceImpl.removeBookById(bookId);
    }
}
