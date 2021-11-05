package team1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import team1.dto.AuthorDto;
import team1.service.AuthorService;

import java.security.Principal;

@Controller
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/authors")
    public ModelAndView showAllAuthors() {
        ModelAndView modelAndView = new ModelAndView("authors");
        modelAndView.addObject("authors", authorService.getAll());
        return modelAndView;
    }

    @GetMapping ("/add")
    public String addAuthor(Model model) {
        model.addAttribute("authorDto", new AuthorDto());
        return "add-author";
    }


}
