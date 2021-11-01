package com.web.club3.dao;

import com.web.club3.model.BookOrder;

import java.util.List;

public interface BookOrderDAO {
    BookOrder findById(int id);

    List<BookOrder> findAll();

    BookOrder create(BookOrder bookOrder);

    BookOrder update(BookOrder bookOrder);

    void deleteById(int id);
}
