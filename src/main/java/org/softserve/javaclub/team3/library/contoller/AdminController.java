package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.service.CustomerService;
import org.softserve.javaclub.team3.library.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    private CustomerService customerServiceImpl;


    @GetMapping("/admin")
    public String userList(Model model) {
        model.addAttribute("allUsers", customerServiceImpl.allUsers());
        return "admin";
    }

    @PostMapping("/admin")
    public String deleteUser(@RequestParam(required = true, defaultValue = "") String userId,
                             @RequestParam(required = true, defaultValue = "") String action,
                             Model model) {
        if (action.equals("delete")) {
            customerServiceImpl.deleteUser(userId);
        }
        return "redirect:/admin";
    }
}