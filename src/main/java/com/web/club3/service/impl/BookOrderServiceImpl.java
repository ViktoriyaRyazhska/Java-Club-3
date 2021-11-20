package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookDAOImpl;
import com.web.club3.dao.impl.BookOrderDAOImpl;
import com.web.club3.dao.impl.UserDAOImpl;
import com.web.club3.dto.BookOrderDTO;
import com.web.club3.model.BookOrder;
import com.web.club3.service.BookOrderService;
import com.web.club3.service.CRUDService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookOrderServiceImpl implements CRUDService<BookOrderDTO>, BookOrderService {

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
    public BookOrderDTO findById(int id) {
        BookOrder bookOrder = bookOrderDAO.findById(id);
        return modelMapper.map(bookOrder, BookOrderDTO.class);
    }

    @Override
    public List<BookOrderDTO> findAll() {
        List<BookOrder> bookOrders = bookOrderDAO.findAll();
        return bookOrders.stream().map(bo -> modelMapper.map(bo, BookOrderDTO.class)).collect(Collectors.toList());
    }

    @Override
    public BookOrderDTO create(BookOrderDTO bookOrderDTO) {
        BookOrder bookOrder = modelMapper.map(bookOrderDTO, BookOrder.class);
        bookOrder.setLendingDate(LocalDate.now());
        return modelMapper.map(bookOrderDAO.create(bookOrder), BookOrderDTO.class);
    }

    @Override
    public BookOrderDTO update(BookOrderDTO bookOrderDTO) {
        BookOrder bookOrder = modelMapper.map(bookOrderDTO, BookOrder.class);
        return modelMapper.map(bookOrderDAO.update(bookOrder), BookOrderDTO.class);
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
    public BookOrderDTO returnBook(BookOrderDTO bookOrderDTO) {
        BookOrder bookOrder = modelMapper.map(bookOrderDTO, BookOrder.class);
        return modelMapper.map(bookOrderDAO.returnBook(bookOrder), BookOrderDTO.class);
    }

    @Override
    public List<BookOrder> readBooksInCertainDays(int days) {
        return bookOrderDAO.readBooksInCertainDays(days);
    }
}
