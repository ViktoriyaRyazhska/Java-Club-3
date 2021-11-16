package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.model.BookRequest;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.service.BookRequestService;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private CustomerService customerServiceImpl;
    @Autowired
    private BookRequestService bookRequestServiceImpl;

    @GetMapping("/admin")
    public String userList(Model model) {
        model.addAttribute("allUsers", customerServiceImpl.allUsers());
        return "admin";
    }

    @RequestMapping(value = "/info/{username}", method = RequestMethod.GET)
    public String getRequests(Model model, @PathVariable String username) {
        final Customer customer = customerServiceImpl.findUserByUsername(username);
        final List<BookRequest> bookRequests = bookRequestServiceImpl.findRequestsByCustomer(username);
        model.addAttribute("requests", bookRequests);
        model.addAttribute("customer", customer);
        return "reader-info";
    }
    @RequestMapping(value = "/customer/delete/{id}", method = RequestMethod.POST)
    public String deleteUser(@PathVariable String id){
        customerServiceImpl.deleteUser(id);
        return "index";
    }
}