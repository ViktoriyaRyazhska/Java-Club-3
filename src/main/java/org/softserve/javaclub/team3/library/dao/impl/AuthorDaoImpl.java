package org.softserve.javaclub.team3.library.dao.impl;

import org.softserve.javaclub.team3.library.dao.AuthorDao;
import org.softserve.javaclub.team3.library.model.Author;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class AuthorDaoImpl extends AbstractDao<Author> implements AuthorDao {

}
