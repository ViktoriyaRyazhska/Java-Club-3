package com.web.club3.controller;

import com.web.club3.dto.GenreDto;
import com.web.club3.model.Book;
import com.web.club3.model.Genre;
import com.web.club3.service.impl.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/genre")
public class GenreController {
    private final GenreServiceImpl genreService;

    @Autowired
    public GenreController(GenreServiceImpl genreService) {
        this.genreService = genreService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showGenrePage() {
        return "genre/genre";
    }

    @GetMapping("/all")
    public String showAllGenres(Model model) {
        List<GenreDto> genres = genreService.findAll();
        model.addAttribute("genreModel", genres);
        return "genre/all";
    }

}
