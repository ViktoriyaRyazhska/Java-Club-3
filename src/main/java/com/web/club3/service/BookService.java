package com.web.club3.service;

import com.web.club3.dto.BookDto;
import com.web.club3.model.Author;
import com.web.club3.model.Book;

import java.util.List;

public interface BookService {
    public BookDto createBook(BookDto bookDto);

    boolean available(int id);

    List<Book> findByAuthor(Author author);

    Book findByTitle(String title);

    void updateCopiesById(int id, int copies);

    void deleteOneCopy(int bookId);

    void addOneCopy(int bookId);

    int getCopiesById(int id);

    void deleteOneCopyById(int id);
}
