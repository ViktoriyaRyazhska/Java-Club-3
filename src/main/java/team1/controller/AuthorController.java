package team1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import team1.service.AuthorService;

@Controller
public class AuthorController {
    @Autowired
    AuthorService authorService;


}
