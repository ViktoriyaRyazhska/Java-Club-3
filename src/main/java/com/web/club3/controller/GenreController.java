package com.web.club3.controller;

import com.web.club3.dto.GenreDTO;
import com.web.club3.model.Genre;
import com.web.club3.service.impl.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/genre")
public class GenreController {
    private final GenreServiceImpl genreService;

    @Autowired
    public GenreController(GenreServiceImpl genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/{genreId}")
    public String getById(@PathVariable int genreId, Model model){
        model.addAttribute("genreModel", genreService.findById(genreId));
        return "genre/genre";
    }

    @GetMapping("/all")
    public String showAllGenres(Model model) {
        List<GenreDTO> genres = genreService.findAll();
        model.addAttribute("genreModel", genres);
        return "genre/allGenres";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("genreModel", new Genre());
        return "genre/createGenre";
    }

    @PostMapping("/create")
    public String createGenre(@ModelAttribute("genreModel") GenreDTO genreDTO){
        genreService.create(genreDTO);
        return "redirect:/genre/all";
    }

}
