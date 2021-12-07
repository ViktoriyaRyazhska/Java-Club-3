package org.softserve.javaclub.team3.library.service;

import org.softserve.javaclub.team3.library.dto.BookRequestDto;
import org.softserve.javaclub.team3.library.model.BookRequest;

import java.util.List;

public interface BookRequestService {

    boolean requestBook(BookRequestDto bookRequestDto) throws Exception;
    List<BookRequest> findRequests();
    List<BookRequest> findRequestsByBook(String id);
    List<BookRequest> findRequestsByCustomer(String username);
    boolean returnBook(String id);

    void returnAllBooks(String id);

}
