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
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookServiceImpl;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getAllBooks() {
        ModelAndView modelAndView = new ModelAndView("books");
        modelAndView.addObject("books", bookServiceImpl.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public String getBookById(@PathVariable String id, Model model) {
        model.addAttribute("book", bookServiceImpl.findById(id));
        return "book";
    }

    @RequestMapping(value = "/title/", method = RequestMethod.GET)
    public ModelAndView getBookByTitle(@RequestParam String title) {
        ModelAndView modelAndView = new ModelAndView("book");
        modelAndView.addObject("book", bookServiceImpl.findByTitle(title));
        return modelAndView;
    }

    @RequestMapping(value = "/author/", method = RequestMethod.GET)
    public ModelAndView getAllBooksByAuthor(@RequestParam String surname) {
        ModelAndView modelAndView = new ModelAndView("books");
        modelAndView.addObject("books", bookServiceImpl.findAllBooksByAuthor(surname));
        return modelAndView;
    }


    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public String addBook(Model model) {
        model.addAttribute("bookDto", new BookDto());
        return "add-book";
    }

    @ResponseBody
    @RequestMapping(path = "/addBook", method = RequestMethod.POST)
    public ModelAndView processAddBook(@ModelAttribute("bookDto") BookDto bookDto, BindingResult bindingResult) {
        bookServiceImpl.addBook(bookDto);
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String deleteBook(@PathVariable String id) {
        bookServiceImpl.removeBookById(id);
        return "index";
    }
}
