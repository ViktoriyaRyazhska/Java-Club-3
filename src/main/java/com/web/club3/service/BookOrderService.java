package com.web.club3.service;

import com.web.club3.model.BookOrder;

import java.time.LocalDate;
import java.util.List;

public interface BookOrderService {

    void deleteById(int id);

    String averageTimeOfUserReadSingleBook(int userId);

    Long getCountInPeriod(LocalDate startDate, LocalDate endDate);

    Double averageTimeOfReadingBook(int bookId);

    Long howManyBooksUserRead(int userId);

    Long howManyBooksAreReading(int userId);

    Long howManyRequestUserDidToLibrary(int userId, LocalDate startDate, LocalDate endDate);

    String fromTheMostPopularToTheLessPopularBook(LocalDate startDate, LocalDate endDate);

    void returnBook(int bookId,int bookOrderId);

    void lendBook(int bookId,BookOrder bookOrder);

    List<BookOrder> readedBooksInCertainDays(int days);
}
