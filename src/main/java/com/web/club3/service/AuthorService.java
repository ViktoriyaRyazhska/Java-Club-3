package com.web.club3.service;


import com.web.club3.model.Author;

import java.util.List;

public interface AuthorService {
    Author findById(int id);

    List<Author> findAll();

    Author create(Author author);

    Author update(Author author);

    void deleteById(int id);
}
