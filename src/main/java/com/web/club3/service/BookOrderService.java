package com.web.club3.service;

import com.web.club3.dto.BookOrderDto;
import com.web.club3.model.BookOrder;

import java.time.LocalDate;
import java.util.List;

public interface BookOrderService {

    BookOrderDto createOrder(int userId, int bookId, BookOrderDto bookOrderDto);

    void deleteById(int id);

    String averageTimeOfUserReadSingleBook(int userId);

    Long getCountInPeriod(LocalDate startDate, LocalDate endDate);

    Double averageTimeOfReadingBook(int bookId);

    Long howManyBooksUserRead(int userId);

    Long howManyBooksAreReading(int userId);

    Long howManyRequestUserDidToLibrary(int userId, LocalDate startDate, LocalDate endDate);

    String fromTheMostPopularToTheLessPopularBook(LocalDate startDate, LocalDate endDate);

    void returnBook(int bookId,int bookOrderId);

    BookOrderDto lendBook(int bookId,int userId, BookOrderDto bookOrderDto);

    List<BookOrder> readBooksInCertainDays(int days);
}
