package org.softserve.javaclub.team3.library.service.impl;

import org.softserve.javaclub.team3.library.dao.BookDao;
import org.softserve.javaclub.team3.library.dto.BookDto;
import org.softserve.javaclub.team3.library.model.Book;
import org.softserve.javaclub.team3.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookDao bookDaoImpl;

    @Autowired
    private AuthorServiceImpl authorService;

    @Autowired
    public void setBookDaoImpl(BookDao bookDaoImpl) {
        this.bookDaoImpl = bookDaoImpl;
        this.bookDaoImpl.setClazz(Book.class);
    }

    @Override
    public Book findById(int bookId) {
        return bookDaoImpl.findById(bookId);
    }

    @Override
    public List<Book> findAll() {
        return bookDaoImpl.findAll();
    }

    @Override
    public void addBook(BookDto bookdto) {
        Book book = new Book();
        book.setTitle(bookdto.getTitle());
        book.setTakenCount(bookdto.getTakenCount());
        book.setCopies(bookdto.getCopies());
        book.setAuthor(authorService.findById(bookdto.getAuthorId()));
        bookDaoImpl.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookDaoImpl.update(book);
    }

    @Override
    public void removeBook(Book book) {
        bookDaoImpl.remove(book);
    }

    @Override
    public void removeBookById(int bookId) {
        bookDaoImpl.removeById(bookId);
    }
}
