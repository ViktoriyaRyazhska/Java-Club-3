package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookDAOImpl;
import com.web.club3.dao.impl.BookOrderDAOImpl;
import com.web.club3.dao.impl.UserDAOImpl;
import com.web.club3.model.BookOrder;
import com.web.club3.service.BookOrderService;
import com.web.club3.service.BookService;
import com.web.club3.service.CRUDService;
import com.web.club3.util.DateUtil;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookOrderServiceImpl implements CRUDService<BookOrder>, BookOrderService {

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

    @Override
    public String averageTimeOfUserReadSingleBook(int userId) {
        return bookOrderDAO.averageTimeOfUserReadSingleBook(userId);
    }


    @Override
    public Long getCountInPeriod(LocalDate startDate, LocalDate endDate)
    {
        return bookOrderDAO.getCountInPeriod(startDate , endDate);
    }

    @Override
    public Double averageTimeOfReadingBook(int id) {
        return bookOrderDAO.averageTimeOfReadingBook(id);
    }

    @Override
    public Long howManyBooksUserRead(int userId) {
        return bookOrderDAO.howManyBooksUserRead(userId);
    }

    @Override
    public Long howManyBooksAreReading(int userId) {
        return bookOrderDAO.howManyBooksAreReading(userId);
    }

    @Override
    public Long howManyRequestUserDidToLibrary(int userId, LocalDate startDate, LocalDate endDate) {
        return bookOrderDAO.howManyRequestUserDidToLibrary(userId,startDate,endDate);
    }

    @Override
    public String fromTheMostPopularToTheLessPopularBook(LocalDate startDate, LocalDate endDate) {
        return bookOrderDAO.fromTheMostPopularToTheLessPopularBook(startDate,endDate);
    }


}
