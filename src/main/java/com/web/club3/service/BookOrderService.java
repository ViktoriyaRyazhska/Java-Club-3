package com.web.club3.service;

import com.web.club3.model.BookOrder;

import java.time.LocalDate;
import java.util.List;

public interface BookOrderService {

    BookOrder createOrder(int userId, int bookId, BookOrder bookOrder);

    void deleteById(int id);

    String averageTimeOfUserReadSingleBook(int userId);

    Long getCountInPeriod(LocalDate startDate, LocalDate endDate);

    Double averageTimeOfReadingBook(int bookId);

    Long howManyBooksUserRead(int userId);

    Long howManyBooksAreReading(int userId);

    Long howManyRequestUserDidToLibrary(int userId, LocalDate startDate, LocalDate endDate);

    String fromTheMostPopularToTheLessPopularBook(LocalDate startDate, LocalDate endDate);

    void returnBook(int bookId,int bookOrderId);

    BookOrder lendBook(int bookId,int userId, BookOrder bookOrder);

    List<BookOrder> readBooksInCertainDays(int days);
}
