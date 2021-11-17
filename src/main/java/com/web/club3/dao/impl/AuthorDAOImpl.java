package com.web.club3.dao.impl;


import com.web.club3.dao.DAO;
import com.web.club3.model.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorDAOImpl implements DAO<Author> {
    private final SessionFactory sessionFactory;

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
        Session session = sessionFactory.openSession();
        return session.createQuery("select a from Author a", Author.class).getResultList();
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
        Author author = session.get(Author.class, id);
        session.delete(author);
        tx1.commit();
        session.close();
    }
}
