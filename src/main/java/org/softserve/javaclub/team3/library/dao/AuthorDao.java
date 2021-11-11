package org.softserve.javaclub.team3.library.dao;

import org.softserve.javaclub.team3.library.model.Author;

public interface AuthorDao extends AbstractDao<Author> {

    Author findByNameOrSurname(String param);

}
