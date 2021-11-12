package com.web.club3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class UserController {
    @RequestMapping (value = "/", method= RequestMethod.GET)
    public String greeting(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST )
    public void login(){

    }
}
