package org.softserve.javaclub.team3.library.service.impl;

import org.softserve.javaclub.team3.library.dao.BookRequestDao;
import org.softserve.javaclub.team3.library.dto.BookRequestDto;
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

    @Autowired
    private BookRequestDao bookRequestDaoImpl;
    @Autowired
    private BookService bookServiceImpl;
    @Autowired
    private CustomerService customerServiceImpl;

    @Override
    public void requestBook(BookRequestDto bookRequestDto) throws Exception {
        if (isBookAvailable(bookRequestDto)) {
            bookRequestDaoImpl.save(createBookRequest(bookRequestDto));
        } else {
            //TODO: Create exception
            throw new Exception();
        }
    }

    @Override
    public List<BookRequest> findRequestsByBook(String id) {
        return bookRequestDaoImpl.findRequestsByBook(id);
    }

    @Override
    public List<BookRequest> findRequestsByCustomer(String username) {
        return bookRequestDaoImpl.findRequestsByCustomer(username);
    }

    private boolean isBookAvailable(BookRequestDto bookRequestDto){
        long booksCount = findRequestsByBook(bookRequestDto.getBookId())
                .stream()
                .filter(BookRequest::isActive).count();
        int copies = bookServiceImpl.findById(bookRequestDto.getBookId()).getCopies();
        return copies > booksCount;
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
