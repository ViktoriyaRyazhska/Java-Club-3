package org.softserve.javaclub.team3.library.dao.mapper;

import org.softserve.javaclub.team3.library.model.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorRowMapper implements RowMapper<Author> {
    @Override
    public Author mapRow(ResultSet resultSet, int i) throws SQLException {
        final Author author = new Author();
        author.setId(resultSet.getInt("id"));
        author.setName(resultSet.getString("name"));
        author.setSurname(resultSet.getString("surname"));
        return author;
    }
}
