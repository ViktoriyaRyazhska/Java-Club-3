package org.softserve.javaclub.team3.library.dao.mapper;

import org.softserve.javaclub.team3.library.dao.AuthorDao;
import org.softserve.javaclub.team3.library.model.Author;
import org.softserve.javaclub.team3.library.model.Book;
import org.softserve.javaclub.team3.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {

        final Book book = new Book();
        book.setId(resultSet.getString("book_id"));
        book.setTitle(resultSet.getString("title"));
        book.setCopies(resultSet.getInt("copies"));
        book.setTakenCount(resultSet.getInt("takenCount"));
        final Author author = new Author();
        author.setName(resultSet.getString("name"));
        author.setSurname(resultSet.getString("surname"));
        author.setId(resultSet.getString("author_id"));
        book.setAuthor(author);
        return book;
    }
}
