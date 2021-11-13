package org.softserve.javaclub.team3.library.contoller;

import org.dom4j.rule.Mode;
import org.softserve.javaclub.team3.library.dto.BookRequestDto;
import org.softserve.javaclub.team3.library.model.BookRequest;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.service.BookRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/books/customer")
public class BookRequestController {

    @Autowired
    private BookRequestService bookRequestServiceImpl;

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String getRequests(Model model, @PathVariable String username) {
        final List<BookRequest> bookRequests = bookRequestServiceImpl.findRequestsByCustomer(username);
        final Customer customer = bookRequests.stream().map(BookRequest::getCustomer).findAny().orElse(null);
        model.addAttribute("requests", bookRequests);
        model.addAttribute("customer", customer);
        return "profile";
    }

    @ResponseBody
    @RequestMapping(value = "/read", method = RequestMethod.POST)
    public void readBook(@ModelAttribute BookRequestDto bookRequestDto) throws Exception {
        bookRequestServiceImpl.requestBook(bookRequestDto);
    }
}
