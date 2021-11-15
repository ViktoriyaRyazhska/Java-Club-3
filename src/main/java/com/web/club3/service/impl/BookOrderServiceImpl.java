package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookDAOImpl;
import com.web.club3.dao.impl.BookOrderDAOImpl;
import com.web.club3.dao.impl.UserDAOImpl;
import com.web.club3.dto.BookOrderDto;
import com.web.club3.model.BookOrder;
import com.web.club3.service.BookOrderService;
import com.web.club3.service.CRUDService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookOrderServiceImpl implements CRUDService<BookOrder>, BookOrderService {

    private final BookDAOImpl bookDAO;
    private final BookOrderDAOImpl bookOrderDAO;
    private final ModelMapper modelMapper;
    private final UserDAOImpl userDAO;

    @Autowired
    public BookOrderServiceImpl(BookOrderDAOImpl bookOrderDAO, BookDAOImpl bookDAO, ModelMapper modelMapper, UserDAOImpl userDAO) {
        this.bookOrderDAO = bookOrderDAO;
        this.bookDAO = bookDAO;
        this.modelMapper = modelMapper;
        this.userDAO = userDAO;
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
    public BookOrder createOrder(int userId, int bookId, BookOrder bookOrder) {
        bookOrder.setLendingDate(LocalDate.now());
        bookOrder.setUsers(userDAO.findById(userId));
        bookOrder.setBook(bookDAO.findById(bookId));
        return bookOrderDAO.create(bookOrder);
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
    public Long getCountInPeriod(LocalDate startDate, LocalDate endDate) {
        return bookOrderDAO.getCountInPeriod(startDate, endDate);
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
        return bookOrderDAO.howManyRequestUserDidToLibrary(userId, startDate, endDate);
    }

    @Override
    public String fromTheMostPopularToTheLessPopularBook(LocalDate startDate, LocalDate endDate) {
        return bookOrderDAO.fromTheMostPopularToTheLessPopularBook(startDate, endDate);
    }

    @Override
    public void returnBook(int bookId, int bookOrderId) {
        bookOrderDAO.returnBook(bookId, bookOrderId);
    }

    @Override
    public BookOrder lendBook(int userId, int bookId, BookOrder bookOrder) {
        bookDAO.deleteOneCopy(bookId);
        return createOrder(userId, bookId, bookOrder);
    }

    @Override
    public List<BookOrder> readBooksInCertainDays(int days) {
        return bookOrderDAO.readedBooksInCertainDays(days);
    }
}
