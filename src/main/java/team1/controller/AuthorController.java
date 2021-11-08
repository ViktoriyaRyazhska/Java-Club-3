package team1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import team1.dto.AuthorDto;
import team1.entity.Author;
import team1.service.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/all")
    public ModelAndView showAllAuthors() {
        ModelAndView modelAndView = new ModelAndView("authors");
        modelAndView.addObject("authors", authorService.getAll());
        return modelAndView;
    }
}
