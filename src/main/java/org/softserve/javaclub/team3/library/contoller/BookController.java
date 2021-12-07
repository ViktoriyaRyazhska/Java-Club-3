package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.dto.BookDto;
import org.softserve.javaclub.team3.library.model.Book;
import org.softserve.javaclub.team3.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookServiceImpl;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookServiceImpl.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public ResponseEntity<Book> getBookById(@RequestParam String id) {
        return new ResponseEntity<>(bookServiceImpl.findById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/title", method = RequestMethod.GET)
    public ResponseEntity<Book> getBookByTitle(@RequestParam String title) {
        return new ResponseEntity<>(bookServiceImpl.findByTitle(title), HttpStatus.OK);
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getAllBooksByAuthor(@RequestParam String surname) {
        return new ResponseEntity<>(bookServiceImpl.findAllBooksByAuthor(surname), HttpStatus.OK);
    }

    @RequestMapping(path = "/addBook", method = RequestMethod.POST)
    public ResponseEntity<String> addBook(@RequestBody BookDto bookDto) {
        bookServiceImpl.addBook(bookDto);
        return new ResponseEntity<>("Book successfully added", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteBook(@RequestParam String id) {
        bookServiceImpl.removeBookById(id);
        return new ResponseEntity<>("Book successfully removed", HttpStatus.OK);
    }
}
