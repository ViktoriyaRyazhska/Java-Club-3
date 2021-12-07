package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.dto.BookRequestDto;
import org.softserve.javaclub.team3.library.model.BookRequest;
import org.softserve.javaclub.team3.library.service.BookRequestService;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books/customer")
public class BookRequestController {

    @Autowired
    private BookRequestService bookRequestServiceImpl;

    @RequestMapping(value = "/requests", method = RequestMethod.GET)
    public ResponseEntity<List<BookRequest>> getRequests(@RequestParam String username) {
        final List<BookRequest> bookRequests = bookRequestServiceImpl.findRequestsByCustomer(username);
        return new ResponseEntity<>(bookRequests, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<BookRequest>> getUserRequests() {
        final List<BookRequest> bookRequests = bookRequestServiceImpl.findRequests();
        return new ResponseEntity<>(bookRequests, HttpStatus.OK);
    }

    @RequestMapping(value = "/read", method = RequestMethod.POST)
    public ResponseEntity<String> readBook(@RequestBody BookRequestDto bookRequestDto) throws Exception {
        if(bookRequestServiceImpl.requestBook(bookRequestDto)){
            return new ResponseEntity<>("Book has been added for reading", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>("There are no copies of this book", HttpStatus.NOT_FOUND);

    }

    @RequestMapping(value = "/return", method = RequestMethod.POST)
    public ResponseEntity<String> returnBook(@RequestParam String id) {
        if(bookRequestServiceImpl.returnBook(id)){
            return new ResponseEntity<>("Book successfully returned", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
