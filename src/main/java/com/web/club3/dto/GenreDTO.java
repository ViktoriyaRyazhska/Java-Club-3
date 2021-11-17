package com.web.club3.dto;

import com.web.club3.model.Book;
import lombok.Data;

import java.util.List;
@Data
public class GenreDTO {
    private int id;
    private String name;
    private List<Book> book;
}
