package org.softserve.javaclub.team3.library.service;

import org.softserve.javaclub.team3.library.dto.AuthorDto;
import org.softserve.javaclub.team3.library.model.Author;
import org.softserve.javaclub.team3.library.model.Book;

import java.util.List;

public interface AuthorService {
    Author findById(int authorId);
    List<Author> findAll();
    void addAuthor(AuthorDto authorDto);
    void updateAuthor(Author author);
    void removeAuthor(Author author);
    void removeAuthorById(int authorId);
}
