package com.web.club3.service.impl;

import com.web.club3.dao.impl.AuthorDAOImpl;
import com.web.club3.model.Author;
import com.web.club3.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorDAOImpl authorDAO;

    @Autowired
    public AuthorServiceImpl(AuthorDAOImpl authorDAO) {
        this.authorDAO = authorDAO;
    }

    @Override
    public Author findById(int id) {
        return authorDAO.findById(id);
    }

    @Override
    public List<Author> findAll() {
        return authorDAO.findAll();
    }

    @Override
    public Author create(Author author) {
        return authorDAO.create(author);
    }

    @Override
    public Author update(Author author) {
        return authorDAO.update(author);
    }

    @Override
    public void deleteById(int id) {
        authorDAO.deleteById(id);
    }
}
