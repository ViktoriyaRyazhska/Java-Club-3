package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookOrderDAOImpl;
import com.web.club3.model.BookOrder;
import com.web.club3.service.BookOrderService;
import com.web.club3.service.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookOrderServiceImpl implements CRUDService<BookOrder> {

    private BookOrderDAOImpl bookOrderDAO;

    @Autowired
    public BookOrderServiceImpl(BookOrderDAOImpl bookOrderDAO) {
        this.bookOrderDAO = bookOrderDAO;
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
}
