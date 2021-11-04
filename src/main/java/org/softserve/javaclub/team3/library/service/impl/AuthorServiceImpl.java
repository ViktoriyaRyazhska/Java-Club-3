package org.softserve.javaclub.team3.library.service.impl;

import org.softserve.javaclub.team3.library.dao.impl.AuthorDaoImpl;
import org.softserve.javaclub.team3.library.dao.impl.BookDaoImpl;
import org.softserve.javaclub.team3.library.dto.AuthorDto;
import org.softserve.javaclub.team3.library.model.Author;
import org.softserve.javaclub.team3.library.model.Book;
import org.softserve.javaclub.team3.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorDaoImpl authorDao;

    @Autowired
    public void setAuthorDao(AuthorDaoImpl authorDao) {
        this.authorDao = authorDao;
        this.authorDao.setClazz(Author.class);
    }


    @Override
    public Author findById(int authorId) {
        return authorDao.findById(authorId);
    }

    @Override
    public List<Author> findAll() {
        return authorDao.findAll();
    }

    @Override
    public void addAuthor(AuthorDto authorDto) {
        Author author = new Author();
        author.setName(authorDto.getName());
        author.setSurname(authorDto.getSurname());
        authorDao.save(author);
    }

    @Override
    public void updateAuthor(Author author) {
        authorDao.update(author);
    }

    @Override
    public void removeAuthor(Author author) {
        authorDao.remove(author);
    }

    @Override
    public void removeAuthorById(int authorId) {
        authorDao.removeById(authorId);
    }
}
