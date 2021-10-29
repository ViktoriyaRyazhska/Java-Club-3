package com.web.club3.dao.impl;

import com.web.club3.dao.GenreDAO;
import com.web.club3.model.Genre;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenreDAOImpl implements GenreDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public GenreDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Genre findById(int id) {
        return null;
    }

    @Override
    public List<Genre> findAll() {
        return null;
    }

    @Override
    public Genre create(Genre genre) {
        return null;
    }

    @Override
    public Genre update(Genre genre) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
