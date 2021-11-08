package com.web.club3.dao;

import com.web.club3.model.BookOrder;

import java.time.LocalDate;
import java.util.List;

public interface BookOrderDAO {

    List<BookOrder> test(LocalDate localDate1, LocalDate localDate2);

    BookOrder test2(int id);

    Long theMostPopular(LocalDate localDate1, LocalDate localDate2);

}
