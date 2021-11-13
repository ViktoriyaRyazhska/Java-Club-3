package org.softserve.javaclub.team3.library.service;

import org.softserve.javaclub.team3.library.dto.BookRequestDto;
import org.softserve.javaclub.team3.library.model.BookRequest;

import java.util.List;

public interface BookRequestService {
    void requestBook(BookRequestDto bookRequestDto) throws Exception;
    List<BookRequest> findRequestsByBook(String id);
    List<BookRequest> findRequestsByCustomer(String username);

}
