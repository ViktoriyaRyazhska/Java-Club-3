package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.model.BookRequest;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.service.BookRequestService;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CustomerService customerServiceImpl;
    @Autowired
    private BookRequestService bookRequestServiceImpl;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> userList() {
        return new ResponseEntity<>(customerServiceImpl.allUsers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ResponseEntity<List<BookRequest>> getRequests(@RequestParam String username) {
        final List<BookRequest> bookRequests = bookRequestServiceImpl.findRequestsByCustomer(username);
        return new ResponseEntity<>(bookRequests, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer/delete", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteUser(@RequestParam String id) {
        customerServiceImpl.deleteUser(id);
        return new ResponseEntity<>("Customer has been removed", HttpStatus.OK);
    }
}