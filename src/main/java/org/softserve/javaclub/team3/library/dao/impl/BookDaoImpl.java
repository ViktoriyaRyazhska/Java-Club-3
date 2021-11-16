package org.softserve.javaclub.team3.library.dao.impl;

import org.softserve.javaclub.team3.library.dao.BookDao;
import org.softserve.javaclub.team3.library.dao.mapper.BookRowMapper;
import org.softserve.javaclub.team3.library.model.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BookDaoImpl extends AbstractDaoImpl<Book> implements BookDao {

    private static final String FIND_BOOK_BY_TITLE_QUERY =
            "SELECT b.book_id, b.copies, b.takenCount, b.title, a.author_id, a.name, a.surname " +
                    "FROM Book AS b JOIN Author AS a ON b.author_author_id = a.author_id " +
                    "WHERE title = ? ";
    private static final String FIND_BOOK_BY_AUTHOR_QUERY =
            "SELECT b.book_id, b.copies, b.takenCount, b.title, a.author_id, a.name, a.surname " +
                    "FROM Book AS b " +
                    "JOIN Author AS a ON b.author_author_id = a.author_id " +
                    "WHERE a.surname = ? ";

    private final RowMapper<Book> bookRowMapper;

    public BookDaoImpl() {
        bookRowMapper = new BookRowMapper();
    }

    @Override
    public Book findByTitle(String title) {
        return findByParam(bookRowMapper, FIND_BOOK_BY_TITLE_QUERY, title);
    }

    @Override
    public List<Book> findAllBooksByAuthor(String surname) {
        return findListByParam(bookRowMapper, FIND_BOOK_BY_AUTHOR_QUERY, surname);
    }
}