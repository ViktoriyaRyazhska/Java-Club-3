package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookDAOImpl;
import com.web.club3.dto.BookDTO;
import com.web.club3.model.Author;
import com.web.club3.model.Book;
import com.web.club3.service.BookService;
import com.web.club3.service.CRUDService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class BookServiceImpl implements CRUDService<BookDTO>, BookService {
    private final BookDAOImpl bookDAO;
    private final ModelMapper modelMapper;

    @Autowired
    public BookServiceImpl(BookDAOImpl bookDAO, ModelMapper modelMapper) {
        this.bookDAO = bookDAO;
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDTO findById(int id) {
        Book book = bookDAO.findById(id);
        return modelMapper.map(book, BookDTO.class);
    }

    @Override
    public List<BookDTO> findAll() {
        List<Book> books = bookDAO.findAll();
        return books.stream().map(b -> modelMapper.map(b, BookDTO.class)).collect(Collectors.toList());
    }

    @Override
    public BookDTO create(BookDTO bookDTO) {
        Book book = modelMapper.map(bookDTO, Book.class);
        return modelMapper.map(bookDAO.create(book), BookDTO.class);
    }

    @Override
    public BookDTO update(BookDTO bookDTO) {
        Book book = modelMapper.map(bookDTO, Book.class);
        return modelMapper.map(bookDAO.update(book), BookDTO.class);
    }

    @Override
    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }

    @Override
    public boolean available(int id) {
        return bookDAO.available(id);
    }

    @Override
    public List<Book> findByAuthor(Author author) {
        return bookDAO.findByAuthor(author);
    }

    @Override
    public Book findByTitle(String title) {
        return bookDAO.findByTitle(title);
    }

    @Override
    public void updateCopiesById(int id, int copies) {
        bookDAO.updateCopiesById(id, copies);
    }

    @Override
    public void deleteOneCopy(int bookId) {
        bookDAO.deleteOneCopy(bookId);
    }

    @Override
    public void addOneCopy(int bookId) {
        bookDAO.addOneCopy(bookId);
    }

    @Override
    public int getCopiesById(int id) {
        return bookDAO.getCopiesById(id);
    }

    @Override
    public void deleteOneCopyById(int id) {
        bookDAO.updateCopiesById(id, bookDAO.getCopiesById(id) - 1);
    }

    public Book findBookById(int id) {
        return bookDAO.findById(id);
    }

}
