package com.web.club3.dto;

import com.web.club3.model.Author;
import com.web.club3.model.BookOrder;
import com.web.club3.model.Genre;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class BookDto {
    private  int id;
    private String title;
    private int copies;
    private Genre genre;
    private Set<Author> authorSet = new HashSet<>();
    private List<BookOrder> bookOrderList = new ArrayList<>();
}
