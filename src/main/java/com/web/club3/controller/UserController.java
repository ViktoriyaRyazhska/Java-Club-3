package com.web.club3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }

}
