package com.web.club3.controller;

import com.web.club3.model.User;
import com.web.club3.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    private UserServiceImpl userService;

    @Autowired
    public RegistrationController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "user/registration";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute("userForm") User user) {
        userService.create(user);
        return "redirect:/";
    }
}
