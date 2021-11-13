package org.softserve.javaclub.team3.library.dao.mapper;

import org.softserve.javaclub.team3.library.model.Author;
import org.softserve.javaclub.team3.library.model.Book;
import org.softserve.javaclub.team3.library.model.BookRequest;
import org.softserve.javaclub.team3.library.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRequestRowMapper implements RowMapper<BookRequest> {
    @Override
    public BookRequest mapRow(ResultSet resultSet, int i) throws SQLException {
        final BookRequest bookRequest = new BookRequest();
        bookRequest.setId(resultSet.getString("br.id"));
        bookRequest.setActive(resultSet.getBoolean("active"));
        bookRequest.setCreationDate(resultSet.getDate("creationDate"));
        bookRequest.setModificationDate(resultSet.getDate("modificationDate"));

        final Book book = new Book();
        book.setId(resultSet.getString("book_id"));
        book.setTitle(resultSet.getString("title"));
        book.setCopies(resultSet.getInt("copies"));
        book.setTakenCount(resultSet.getInt("takenCount"));

        final Author author = new Author();
        author.setId(resultSet.getString("author_id"));
        author.setName(resultSet.getString("name"));
        author.setSurname(resultSet.getString("surname"));

        book.setAuthor(author);

        final Customer customer = new Customer();
        customer.setId(resultSet.getString("c.id"));
        customer.setUsername(resultSet.getString("username"));
        customer.setAge(resultSet.getInt("age"));
        customer.setRegisterDate(resultSet.getDate("registerDate"));

        bookRequest.setBook(book);
        bookRequest.setCustomer(customer);
        return bookRequest;
    }
}
