package com.web.club3.service.impl;

import com.web.club3.dao.impl.GenreDAOImpl;
import com.web.club3.model.Genre;
import com.web.club3.service.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenreServiceImpl implements CRUDService<Genre> {

    private GenreDAOImpl genreDAO;

    @Autowired
    public GenreServiceImpl(GenreDAOImpl genreDAO) {
        this.genreDAO = genreDAO;
    }

    @Override
    public Genre findById(int id) {
        return genreDAO.findById(id);
    }

    @Override
    public List<Genre> findAll() {
        return genreDAO.findAll();
    }

    @Override
    public Genre create(Genre genre) {
        return genreDAO.create(genre);
    }

    @Override
    public Genre update(Genre genre) {
        return genreDAO.update(genre);
    }

    @Override
    public void deleteById(int id) {
        genreDAO.deleteById(id);
    }
}
