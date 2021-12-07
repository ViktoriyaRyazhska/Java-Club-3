package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.dto.AuthorDto;
import org.softserve.javaclub.team3.library.model.Author;
import org.softserve.javaclub.team3.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorServiceImpl;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Author>> getAllAuthors() {
        return new ResponseEntity<>(authorServiceImpl.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public ResponseEntity<Author> getAuthorById(@RequestParam String id) {
        return new ResponseEntity<>(authorServiceImpl.findById(id), HttpStatus.OK);
    }

    @RequestMapping(path = "/addAuthor", method = RequestMethod.POST)
    public ResponseEntity<String> addAuthor(@RequestBody AuthorDto authorDto) {
        authorServiceImpl.addAuthor(authorDto);
        return new ResponseEntity<>("Author successfully added", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteAuthor(@RequestParam String id) {
        authorServiceImpl.removeAuthorById(id);
        return new ResponseEntity<>("Author successfully removed", HttpStatus.OK);
    }
}
