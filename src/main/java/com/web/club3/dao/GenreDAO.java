package com.web.club3.dao;

import com.web.club3.model.Genre;

import java.util.List;

public interface GenreDAO {
    Genre findById(int id);

    List<Genre> findAll();

    Genre create(Genre genre);

    Genre update(Genre genre);

    void deleteById(int id);
}
