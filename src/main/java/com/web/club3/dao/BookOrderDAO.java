package com.web.club3.dao;

import com.web.club3.model.BookOrder;

import java.time.LocalDate;
import java.util.List;

public interface BookOrderDAO {

    List<BookOrder> theMostPopular(LocalDate localDate1, LocalDate localDate2);

    BookOrder test2(int id);

    void getCountInPeriod(LocalDate localDate1,LocalDate localDate2);

    void averageTimeOfReadingBook(int id);

}
