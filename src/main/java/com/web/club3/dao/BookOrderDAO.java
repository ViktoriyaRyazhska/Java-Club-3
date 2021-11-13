package com.web.club3.dao;

import com.web.club3.model.BookOrder;
import java.time.LocalDate;

public interface BookOrderDAO {

    String averageTimeOfUserReadSingleBook(int userId);

    Long getCountInPeriod(LocalDate startDate, LocalDate endDate);

    Double averageTimeOfReadingBook(int bookId);

    Long howManyBooksUserRead(int userId);

    Long howManyBooksAreReading(int userId);

    Long howManyRequestUserDidToLibrary(int userId, LocalDate startDate, LocalDate endDate);

    String fromTheMostPopularToTheLessPopularBook(LocalDate startDate, LocalDate endDate);

}
