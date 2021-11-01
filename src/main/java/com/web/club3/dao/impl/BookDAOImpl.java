package com.web.club3.dao.impl;

import com.web.club3.dao.BookDAO;
import com.web.club3.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDAOImpl implements BookDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public BookDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Book findById(int id) {
        return sessionFactory.openSession().get(Book.class, id);
    }

    @Override
    public List<Book> findAll() {
        List<Book> book = (List<Book>)  sessionFactory.openSession().createQuery("From book").list();
        return book;
    }

    @Override
    public Book create(Book book) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
        return book;
    }

    @Override
    public Book update(Book book) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(book);
        tx1.commit();
        session.close();
        return book;
    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        Book book = session.get(Book.class, id);
        session.delete(book);
        tx1.commit();
        session.close();
    }
}
