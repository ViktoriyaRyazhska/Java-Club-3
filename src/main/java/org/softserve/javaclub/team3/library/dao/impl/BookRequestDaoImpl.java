package org.softserve.javaclub.team3.library.dao.impl;

import org.softserve.javaclub.team3.library.dao.BookRequestDao;
import org.softserve.javaclub.team3.library.dao.mapper.BookRequestRowMapper;
import org.softserve.javaclub.team3.library.model.BookRequest;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BookRequestDaoImpl extends AbstractDaoImpl<BookRequest> implements BookRequestDao {

    private static final String FIND_REQUESTS_QUERY = "SELECT br.id, " +
            "br.active," +
            "br.creationDate," +
            "br.modificationDate, " +
            "b.book_id, " +
            "b.title, " +
            "b.copies, " +
            "b.takenCount, " +
            "a.author_id, " +
            "a.name, " +
            "a.surname, " +
            "c.id, " +
            "c.username, " +
            "c.age, " +
            "c.registerDate " +
            "FROM bookrequest AS br " +
            "JOIN book AS b ON br.book_book_id = b.book_id " +
            "join author a on a.author_id = b.author_author_id " +
            "join customer c on c.id = br.customer_id";
    private static final String FIND_REQUESTS_BY_BOOK_QUERY = FIND_REQUESTS_QUERY + " Where b.book_id = ?";
    private static final String FIND_REQUESTS_BY_CUSTOMER_QUERY = FIND_REQUESTS_QUERY + " Where c.username = ?";

    private final RowMapper<BookRequest> bookRequestRowMapper;

    public BookRequestDaoImpl() {
        bookRequestRowMapper = new BookRequestRowMapper();
    }

    @Override
    public List<BookRequest> findRequestsByBook(String id) {
        return findListByParam(FIND_REQUESTS_BY_BOOK_QUERY, id, bookRequestRowMapper);
    }

    @Override
    public List<BookRequest> findRequestsByCustomer(String username) {
        return findListByParam(FIND_REQUESTS_BY_CUSTOMER_QUERY, username, bookRequestRowMapper);
    }

}
