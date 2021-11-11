package org.softserve.javaclub.team3.library.dao.impl;

import org.softserve.javaclub.team3.library.dao.AuthorDao;
import org.softserve.javaclub.team3.library.dao.mapper.AuthorRowMapper;
import org.softserve.javaclub.team3.library.model.Author;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class AuthorDaoImpl extends AbstractDaoImpl<Author> implements AuthorDao {


    private static final String FIND_AUTHOR_BY_NAME_OR_SURNAME_QUERY = "SELECT * FROM Author WHERE name = ? OR surname = ?";

    private final RowMapper<Author> authorRowMapper;

    public AuthorDaoImpl() {
        authorRowMapper = new AuthorRowMapper();
    }

    @Override
    public Author findByNameOrSurname(String param) {
        return findByParam(authorRowMapper, FIND_AUTHOR_BY_NAME_OR_SURNAME_QUERY, param);
    }
}
