package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.dto.AuthorDto;
import org.softserve.javaclub.team3.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorServiceImpl;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getAllAuthors() {
        ModelAndView modelAndView = new ModelAndView("authors");
        modelAndView.addObject("authors", authorServiceImpl.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/id/{authorId}", method = RequestMethod.GET)
    public ModelAndView getAuthorById(@PathVariable String authorId) {
        ModelAndView modelAndView = new ModelAndView("author");
        modelAndView.addObject("author", authorServiceImpl.findById(authorId));
        return modelAndView;
    }

    @RequestMapping(value = "/addAuthor", method = RequestMethod.GET)
    public String addAuthor(Model model) {
        model.addAttribute("authorDto", new AuthorDto());
        return "add-author";
    }

    @ResponseBody
    @RequestMapping(path = "/addAuthor", method = RequestMethod.POST)
    public ModelAndView processAddAuthor(@ModelAttribute("authorDto") AuthorDto authorDto, BindingResult bindingResult) {
        authorServiceImpl.addAuthor(authorDto);
        return new ModelAndView("index");
    }
    
    @ResponseBody
    @RequestMapping(value = "/delete/{authorId}", method = RequestMethod.POST)
    public String deleteAuthor(@PathVariable String authorId)  {
        authorServiceImpl.removeAuthorById(authorId);
        return "index";
    }
}
