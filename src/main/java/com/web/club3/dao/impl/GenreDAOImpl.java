package com.web.club3.dao.impl;

import com.web.club3.dao.DAO;
import com.web.club3.model.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenreDAOImpl implements DAO<Genre> {

    private SessionFactory sessionFactory;

    @Autowired
    public GenreDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Genre findById(int id) {
        return sessionFactory.openSession().get(Genre.class, id);
    }

    @Override
    public List<Genre> findAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT a from Genre a", Genre.class).getResultList();
    }

    @Override
    public Genre create(Genre genre) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(genre);
        transaction.commit();
        session.close();
        return genre;
    }

    @Override
    public Genre update(Genre genre) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(genre);
        transaction.commit();
        session.close();
        return genre;
    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Genre genre = session.get(Genre.class, id);
        session.delete(genre);
        transaction.commit();
        session.close();
    }
}
