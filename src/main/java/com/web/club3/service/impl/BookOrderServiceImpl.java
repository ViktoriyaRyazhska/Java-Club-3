package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookDAOImpl;
import com.web.club3.dao.impl.BookOrderDAOImpl;
import com.web.club3.dao.impl.UserDAOImpl;
import com.web.club3.model.BookOrder;
import com.web.club3.service.BookOrderService;
import com.web.club3.service.BookService;
import com.web.club3.service.CRUDService;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookOrderServiceImpl implements CRUDService<BookOrder>, BookOrderService {

    private BookOrderDAOImpl bookOrderDAO;
    private BookDAOImpl bookDAO;


    @Autowired
    public BookOrderServiceImpl(BookOrderDAOImpl bookOrderDAO, BookDAOImpl bookDAO) {
        this.bookOrderDAO = bookOrderDAO;
        this.bookDAO = bookDAO;
    }

    @Override
    public BookOrder findById(int id) {
        return bookOrderDAO.findById(id);
    }

    @Override
    public List<BookOrder> findAll() {
        return bookOrderDAO.findAll();
    }

    @Override
    public BookOrder create(BookOrder bookOrder) {
        return bookOrderDAO.create(bookOrder);
    }

    @Override
    public BookOrder update(BookOrder bookOrder) {
        return bookOrderDAO.update(bookOrder);
    }

    @Override
    public void deleteById(int id) {
        bookOrderDAO.deleteById(id);
    }

    @Override
    public void returnBook(int bookId, int bookOrderId) {

    }

    @Override
    public List<BookOrder> test(LocalDate localDate1, LocalDate localDate2) {
        return bookOrderDAO.test(localDate1, localDate2);
    }

    @Override
    public Long theMostPopular(LocalDate localDate1, LocalDate localDate2) {
        return bookOrderDAO.theMostPopular(localDate1, localDate2);
    }

    @Override
    public BookOrder test2(int id) {
        return bookOrderDAO.test2(id);
    }
}
