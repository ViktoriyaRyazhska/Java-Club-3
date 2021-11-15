package com.web.club3.dto;

import com.web.club3.model.Book;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GenreDto {
    private int id;
    private String name;
    private List<Book> book = new ArrayList<>();
}
