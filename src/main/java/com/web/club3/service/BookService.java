package com.web.club3.service;

import com.web.club3.model.Author;
import com.web.club3.model.Book;

import java.util.List;

public interface BookService {
    boolean available(int id);

    List<Book> findByAuthor(Author author);

    Book findByTitle(String title);

    void updateCopiesById(int id,int copies);

    int getCopiesById(int id);

    void deleteOneCopyById(int id);
}
