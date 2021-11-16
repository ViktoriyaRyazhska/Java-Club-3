package org.softserve.javaclub.team3.library.dao;

import org.softserve.javaclub.team3.library.model.Book;

import java.util.List;

public interface BookDao extends AbstractDao<Book> {
    Book findByTitle(String title);

    List<Book> findAllBooksByAuthor(String surname);
}
