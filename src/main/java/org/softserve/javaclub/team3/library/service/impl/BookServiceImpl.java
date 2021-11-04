package org.softserve.javaclub.team3.library.service.impl;

import org.softserve.javaclub.team3.library.dao.impl.BookDaoImpl;
import org.softserve.javaclub.team3.library.dto.AuthorDto;
import org.softserve.javaclub.team3.library.dto.BookDto;
import org.softserve.javaclub.team3.library.model.Author;
import org.softserve.javaclub.team3.library.model.Book;
import org.softserve.javaclub.team3.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookDaoImpl bookDao;

    @Autowired
    private AuthorServiceImpl authorService;

    @Autowired
    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
        this.bookDao.setClazz(Book.class);
    }

    @Override
    public Book findById(int bookId) {
        return bookDao.findById(bookId);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public void addBook(BookDto bookdto) {
        Book book = new Book();
        book.setTitle(bookdto.getTitle());
        book.setTakenCount(bookdto.getTakenCount());
        book.setCopies(bookdto.getCopies());
        book.setAuthor(authorService.findById(bookdto.getAuthorId()));
        bookDao.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    @Override
    public void removeBook(Book book) {
        bookDao.remove(book);
    }

    @Override
    public void removeBookById(int bookId) {
        bookDao.removeById(bookId);
    }
}
