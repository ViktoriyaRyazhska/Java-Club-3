package com.web.club3.dao;

import com.web.club3.model.Author;
import com.web.club3.model.Book;

import java.util.List;

public interface BookDAO {
    boolean available(int id);

    List<Book> findByAuthor(Author author);

    Book findByTitle(String title);

    void updateCopiesById(int id, int copies);

    void deleteOneCopy(int bookId);

    void addOneCopy(int bookId);

    int getCopiesById(int id);
}
