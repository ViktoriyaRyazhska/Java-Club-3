package org.softserve.javaclub.team3.library.dao;

import org.softserve.javaclub.team3.library.model.BookRequest;

import java.util.List;

public interface BookRequestDao extends AbstractDao<BookRequest> {

    public List<BookRequest> findRequestsByBook(String id);

    public List<BookRequest> findRequestsByCustomer(String username);

    public void returnAllBooks(String id);
}
