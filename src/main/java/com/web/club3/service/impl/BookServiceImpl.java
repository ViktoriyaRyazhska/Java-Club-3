package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookDAOImpl;
import com.web.club3.model.Book;
import com.web.club3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDAOImpl bookDAO;

    @Autowired
    public BookServiceImpl(BookDAOImpl bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public Book findById(int id) {
        return bookDAO.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public Book create(Book book) {
        return bookDAO.create(book);
    }

    @Override
    public Book update(Book book) {
        return bookDAO.update(book);
    }

    @Override
    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }
}
