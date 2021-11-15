package com.web.club3.controller;

import com.web.club3.dto.AuthorDto;
import com.web.club3.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private AuthorServiceImpl authorService;

    @Autowired
    public AuthorController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/{authorId}")
    public String getById(@PathVariable int authorId, Model model){
        model.addAttribute("authorModel", authorService.findById(authorId));
        return "author/author";
    }

    @GetMapping("/all")
    public String showAllAuthors(Model model) {
        List<AuthorDto> authors = authorService.findAll();
        model.addAttribute("authorModel", authors);
        return "author/allAuthors";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("authorModel", new AuthorDto());
        return "author/createAuthor";
    }

    @PostMapping("/create")
    public String createAuthor(@ModelAttribute("authorModel") AuthorDto authorDto){
        authorService.create(authorDto);
        return "redirect:/author/all";
    }

    @GetMapping("/delete")
    public String delete(Model model){
        model.addAttribute("authorModel", authorService.findAll());
        return "author/deleteAuthor";
    }

    @DeleteMapping("/delete/{authorId}")
    public String deleteAuthor(@PathVariable int authorId){
        authorService.deleteById(authorId);
        return "redirect:/author/all";
    }
}
