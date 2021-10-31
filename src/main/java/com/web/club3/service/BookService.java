package com.web.club3.service;

import com.web.club3.model.Book;

import java.util.List;

public interface BookService {
    Book findById(int id);

    List<Book> findAll();

    Book create(Book book);

    Book update(Book book);

    void deleteById(int id);
}
