package com.web.club3.dao.impl;


import com.web.club3.dao.AuthorDAO;
import com.web.club3.model.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public AuthorDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Author findById(int id) {
        return sessionFactory.openSession().get(Author.class, id);
    }

    @Override
    public List<Author> findAll() {
        List<Author> authors = (List<Author>)  sessionFactory.openSession().createQuery("From author").list();
        return authors;
    }

    @Override
    public Author create(Author author) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(author);
        tx1.commit();
        session.close();
        return author;
    }

    @Override
    public Author update(Author author) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(author);
        tx1.commit();
        session.close();
        return author;
    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        Author users = session.get(Author.class, id);
        session.delete(users);
        tx1.commit();
        session.close();
    }
}
