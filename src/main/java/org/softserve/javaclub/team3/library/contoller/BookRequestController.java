package org.softserve.javaclub.team3.library.contoller;

import org.dom4j.rule.Mode;
import org.softserve.javaclub.team3.library.dto.BookRequestDto;
import org.softserve.javaclub.team3.library.model.BookRequest;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.service.BookRequestService;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/books/customer")
public class BookRequestController {

    @Autowired
    private BookRequestService bookRequestServiceImpl;
    @Autowired
    private CustomerService customerServiceImpl;

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String getRequests(Model model, @PathVariable String username) {
        final Customer customer = customerServiceImpl.findUserByUsername(username);
        final List<BookRequest> bookRequests = bookRequestServiceImpl.findRequestsByCustomer(username);
        model.addAttribute("requests", bookRequests);
        model.addAttribute("customer", customer);
        return "profile";
    }

    @ResponseBody
    @RequestMapping(value = "/read", method = RequestMethod.POST)
    public ModelAndView readBook(@ModelAttribute BookRequestDto bookRequestDto) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
            bookRequestServiceImpl.requestBook(bookRequestDto);
        return modelAndView;
    }

    @RequestMapping(value = "/return/{id}", method = RequestMethod.POST)
    public String returnBook(@PathVariable String id){
        bookRequestServiceImpl.returnBook(id);
        return "index";
    }
}
