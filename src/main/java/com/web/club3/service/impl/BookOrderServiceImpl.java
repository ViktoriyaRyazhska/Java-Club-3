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

import static java.util.stream.Collectors.toList;

@Service
public class BookOrderServiceImpl implements CRUDService<BookOrderDto>, BookOrderService {

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
    public BookOrderDto findById(int id) {
        BookOrder bookOrder = bookOrderDAO.findById(id);
        return modelMapper.map(bookOrder, BookOrderDto.class);
    }

    @Override
    public List<BookOrderDto> findAll() {
        List<BookOrder> bookOrderList = bookOrderDAO.findAll();
        return bookOrderList.stream().map(bo -> modelMapper.map(bo, BookOrderDto.class)).collect(toList());
    }

    @Override
    public BookOrderDto create(BookOrderDto bookOrderDto) {
        BookOrder bookOrder = modelMapper.map(bookOrderDto, BookOrder.class);
        return modelMapper.map(bookOrderDAO.create(bookOrder), BookOrderDto.class);
    }

    @Override
    public BookOrderDto update(BookOrderDto bookOrderDto) {
        BookOrder bookOrder = modelMapper.map(bookOrderDto, BookOrder.class);
        return modelMapper.map(bookOrderDAO.update(bookOrder), BookOrderDto.class);
    }

    @Override
    public BookOrderDto createOrder(int userId, int bookId, BookOrderDto bookOrderDto) {
        BookOrder bookOrder = modelMapper.map(bookOrderDto, BookOrder.class);
        bookOrder.setLendingDate(LocalDate.now());
        bookOrder.setUsers(userDAO.findById(userId));
        bookOrder.setBook(bookDAO.findById(bookId));
        return modelMapper.map(bookOrderDAO.create(bookOrder), BookOrderDto.class);
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
    public BookOrderDto lendBook(int userId, int bookId, BookOrderDto bookOrderDto) {
        bookDAO.deleteOneCopy(bookId);
        return createOrder(userId, bookId, bookOrderDto);
    }

    @Override
    public List<BookOrder> readBooksInCertainDays(int days) {
        return bookOrderDAO.readedBooksInCertainDays(days);
    }
}
