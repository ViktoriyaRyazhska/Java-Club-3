package com.web.club3.dao;

import com.web.club3.model.Book;

import java.util.List;

public interface BookDAO {
    Book findById(int id);

    List<Book> findAll();

    Book create(Book book);

    Book update(Book book);

    void deleteById(int id);
}
