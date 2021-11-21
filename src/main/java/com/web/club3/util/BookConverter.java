package com.web.club3.util;

import com.web.club3.model.Book;
import com.web.club3.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component("bookConverter")
public class BookConverter implements Converter<String, Book> {
    private final BookServiceImpl bookService;

    @Autowired
    public BookConverter(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @Override
    public Book convert(String source) {
        return bookService.findBookById(Integer.parseInt(source));
    }
}
