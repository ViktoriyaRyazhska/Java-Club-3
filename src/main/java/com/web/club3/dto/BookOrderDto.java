package com.web.club3.dto;

import com.web.club3.model.Book;
import com.web.club3.model.User;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookOrderDto {
    private int id;
    private UserDto user;
    private BookDto book;
    private LocalDate lendingDate;
    private LocalDate returnDate;
}
