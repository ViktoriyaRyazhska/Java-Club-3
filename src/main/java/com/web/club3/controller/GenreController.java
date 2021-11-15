package com.web.club3.controller;

import com.web.club3.dto.GenreDto;
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
        List<GenreDto> genres = genreService.findAll();
        model.addAttribute("genreModel", genres);
        return "genre/allGenres";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("genreModel", new GenreDto());
        return "genre/createGenre";
    }

    @PostMapping("/create")
    public String createGenre(@ModelAttribute("genreModel") GenreDto genreDto){
        genreService.create(genreDto);
        return "redirect:/genre/all";
    }

    @GetMapping("/delete")
    public String delete(Model model){
        model.addAttribute("genreModel", genreService.findAll());
        return "genre/deleteGenre";
    }

    @DeleteMapping("/delete/{genreId}")
    public String deleteGenre(@PathVariable int genreId){
        genreService.deleteById(genreId);
    return "redirect:/genre/all";
    }
}
