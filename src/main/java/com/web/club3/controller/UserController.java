package com.web.club3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class UserController {
    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }

    @RequestMapping (value = "/home", method= RequestMethod.GET)
    public String greeting(){
        return "home";
    }
}
