package com.web.club3.dto;

import com.web.club3.model.Author;
import com.web.club3.model.BookOrder;
import lombok.Data;
import java.util.List;
import java.util.Set;

@Data
public class BookDto {
    private  int id;
    private String title;
    private int copies;
    private GenreDto genre;
    private Set<Author> authorSet;
    private List<BookOrder> bookOrderList;
}
