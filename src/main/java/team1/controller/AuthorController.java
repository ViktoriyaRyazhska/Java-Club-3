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

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public String showAllAuthors(Model model) {
        List<Author> authors = authorService.getAll();
        model.addAttribute("searchModel", new AuthorDto());
        model.addAttribute("authors", authors);
        return "/authors/all";
    }

}
