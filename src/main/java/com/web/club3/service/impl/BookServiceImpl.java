package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookDAOImpl;
import com.web.club3.dto.BookDto;
import com.web.club3.model.Author;
import com.web.club3.model.Book;
import com.web.club3.service.BookService;
import com.web.club3.service.CRUDService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;


@Service
public class BookServiceImpl implements CRUDService<Book>, BookService {
    private final BookDAOImpl bookDAO;
    private final ModelMapper modelMapper;

    @Autowired
    public BookServiceImpl(BookDAOImpl bookDAO, ModelMapper modelMapper) {
        this.bookDAO = bookDAO;
        this.modelMapper = modelMapper;
    }

    @Override
    public Book findById(int id) {
        return bookDAO.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public Book create(Book book) {
        return bookDAO.create(book);
    }

    @Override
    public Book update(Book book) {
        return bookDAO.update(book);
    }

    @Override
    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }

    @Override
    public boolean available(int id)
    {
        return  bookDAO.available(id);
    }

    @Override
    public List<Book> findByAuthor(Author author)
    {
        return bookDAO.findByAuthor(author);
    }

    @Override
    public Book findByTitle(String title)
    {
        return bookDAO.findByTitle(title);
    }

    @Override
    public void updateCopiesById(int id,int copies){bookDAO.updateCopiesById(id, copies);}

    @Override
    public void deleteOneCopy(int bookId) {
        bookDAO.deleteOneCopy(bookId);
    }

    @Override
    public void addOneCopy(int bookId) {
        bookDAO.addOneCopy(bookId);
    }

    @Override
    public int getCopiesById(int id)
    {
        return bookDAO.getCopiesById(id);
    }

    @Override
    public void deleteOneCopyById(int id){
        bookDAO.updateCopiesById(id, bookDAO.getCopiesById(id) - 1);
    }

    public BookDto findBookById(int bookId){
        Book book = bookDAO.findById(bookId);
        return modelMapper.map(book, BookDto.class);
    }

    public List<BookDto> findAllBooks(){
        List<Book> books = (List<Book>) bookDAO.findAll();
        return books.stream().map(b-> modelMapper.map(b, BookDto.class)).collect(toList());
    }
}
