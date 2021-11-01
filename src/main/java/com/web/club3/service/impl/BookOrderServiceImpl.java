package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookOrderDAOImpl;
import com.web.club3.model.BookOrder;
import com.web.club3.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookOrderServiceImpl implements BookOrderService {

    BookOrderDAOImpl bookOrderDAO;

    @Autowired
    public BookOrderServiceImpl(BookOrderDAOImpl bookOrderDAO) {
        this.bookOrderDAO = bookOrderDAO;
    }

    @Override
    public BookOrder findById(int id) {
        return null;
    }

    @Override
    public List<BookOrder> findAll() {
        return null;
    }

    @Override
    public BookOrder create(BookOrder bookOrder) {
        return bookOrderDAO.create(bookOrder);
    }

    @Override
    public BookOrder update(BookOrder bookOrder) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
