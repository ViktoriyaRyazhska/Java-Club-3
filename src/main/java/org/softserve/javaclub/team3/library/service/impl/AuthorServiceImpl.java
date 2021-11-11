package org.softserve.javaclub.team3.library.service.impl;

import org.softserve.javaclub.team3.library.dao.AuthorDao;
import org.softserve.javaclub.team3.library.dto.AuthorDto;
import org.softserve.javaclub.team3.library.model.Author;
import org.softserve.javaclub.team3.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorDao authorDaoImpl;

    @Autowired
    public void setAuthorDaoImpl(AuthorDao authorDaoImpl) {
        this.authorDaoImpl = authorDaoImpl;
        this.authorDaoImpl.setClazz(Author.class);
    }

    @Override
    public Author findById(int authorId) {
        return authorDaoImpl.findById(authorId);
    }

    @Override
    public List<Author> findAll() {
        return authorDaoImpl.findAll();
    }

    @Override
    public void addAuthor(AuthorDto authorDto) {
        Author author = new Author();
        author.setName(authorDto.getName());
        author.setSurname(authorDto.getSurname());
        authorDaoImpl.save(author);
    }

    @Override
    public void updateAuthor(Author author) {
        authorDaoImpl.update(author);
    }

    @Override
    public void removeAuthor(Author author) {
        authorDaoImpl.remove(author);
    }

    @Override
    public void removeAuthorById(int authorId) {
        authorDaoImpl.removeById(authorId);
    }
}
