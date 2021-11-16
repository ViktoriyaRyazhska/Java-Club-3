package org.softserve.javaclub.team3.library.service.impl;

import org.softserve.javaclub.team3.library.dao.BookRequestDao;
import org.softserve.javaclub.team3.library.dto.BookRequestDto;
import org.softserve.javaclub.team3.library.exception.NoCopiesOfBookException;
import org.softserve.javaclub.team3.library.model.Book;
import org.softserve.javaclub.team3.library.model.BookRequest;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.service.BookRequestService;
import org.softserve.javaclub.team3.library.service.BookService;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookRequestServiceImpl implements BookRequestService {

    private BookRequestDao bookRequestDaoImpl;
    @Autowired
    private BookService bookServiceImpl;
    @Autowired
    private CustomerService customerServiceImpl;

    @Autowired
    public void setBookRequestDaoImpl(BookRequestDao bookRequestDaoImpl) {
        this.bookRequestDaoImpl = bookRequestDaoImpl;
        this.bookRequestDaoImpl.setClazz(BookRequest.class);
    }

    @Override
    public void requestBook(BookRequestDto bookRequestDto) throws Exception {
        if (isBookAvailable(bookRequestDto)) {
            Book book = bookServiceImpl.findById(bookRequestDto.getBookId());
            int tc = book.getTakenCount() + 1;
            book.setTakenCount(tc);

            int copies = book.getCopies() - 1;
            book.setCopies(copies);

            bookServiceImpl.updateBook(book);
            bookRequestDaoImpl.save(createBookRequest(bookRequestDto));
        } else {
            //TODO: Create exception
            throw new NoCopiesOfBookException("There are no copies of this book");

        }
    }

    @Override
    public void returnBook(String id) {
        Book book = bookRequestDaoImpl.findById(id).getBook();
        int copies = book.getCopies() + 1;
        book.setCopies(copies);
        bookServiceImpl.updateBook(book);

        bookRequestDaoImpl.removeById(id);
    }

    @Override
    public void returnAllBooks(String id) {
        bookRequestDaoImpl.returnAllBooks(id);
    }

    @Override
    public List<BookRequest> findRequestsByBook(String id) {
        return bookRequestDaoImpl.findRequestsByBook(id);
    }

    @Override
    public List<BookRequest> findRequestsByCustomer(String username) {
        return bookRequestDaoImpl.findRequestsByCustomer(username);
    }

    private boolean isBookAvailable(BookRequestDto bookRequestDto) {
        long booksCount = findRequestsByBook(bookRequestDto.getBookId())
                .stream()
                .filter(BookRequest::isActive).count();
        int copies = bookServiceImpl.findById(bookRequestDto.getBookId()).getCopies();
        return copies > 0;
    }

    private BookRequest createBookRequest(BookRequestDto bookRequestDto) {
        final BookRequest bookRequest = new BookRequest();
        final Book book = bookServiceImpl.findById(bookRequestDto.getBookId());
        final Customer customer = customerServiceImpl.findUserByUsername(bookRequestDto.getCustomerUsername());

        bookRequest.setBook(book);
        bookRequest.setCustomer(customer);
        bookRequest.setActive(true);
        bookRequest.setCreationDate(new Date(System.currentTimeMillis()));

        return bookRequest;
    }

}
