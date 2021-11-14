package com.web.club3.controller;

import com.web.club3.dto.AuthorDto;
import com.web.club3.model.Author;
import com.web.club3.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private AuthorServiceImpl authorService;

    @Autowired
    public AuthorController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showAuthorPage() {
        return "author/author";
    }

    @GetMapping("/all")
    public String showAllAuthors(Model model) {
        List<AuthorDto> authors = authorService.findAll();
        model.addAttribute("authorModel", authors);
        return "author/all";
    }
}
