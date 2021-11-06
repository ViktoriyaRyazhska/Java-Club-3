package com.web.club3.service;

import com.web.club3.model.BookOrder;

import java.util.List;

public interface BookOrderService {
    BookOrder findById(int id);

    List<BookOrder> findAll();

    BookOrder create(BookOrder bookOrder);

    BookOrder update(BookOrder bookOrder);

    void deleteById(int id);

    void returnBook(int bookId,int bookOrderId);
}
