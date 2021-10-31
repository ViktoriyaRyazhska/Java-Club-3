package com.web.club3.dao;


import com.web.club3.model.Author;

import java.util.List;

public interface AuthorDAO {
    Author findById(int id);

    List<Author> findAll();

    Author create(Author author);

    Author update(Author author);

    void deleteById(int id);
}
