package com.web.club3.dao.impl;

import com.web.club3.dao.BookOrderDAO;
import com.web.club3.model.BookOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookOrderDAOImpl implements BookOrderDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public BookOrderDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public BookOrder findById(int id) {
        return sessionFactory.openSession().get(BookOrder.class, id);
    }

    @Override
    public List<BookOrder> findAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT a FROM BookOrder a", BookOrder.class).getResultList();
    }

    @Override
    public BookOrder create(BookOrder bookOrder) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bookOrder);
        transaction.commit();
        session.close();
        return bookOrder;
    }

    @Override
    public BookOrder update(BookOrder bookOrder) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(bookOrder);
        transaction.commit();
        session.close();
        return bookOrder;
    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        BookOrder bookOrder = session.get(BookOrder.class, id);
        session.delete(bookOrder);
        transaction.commit();
        session.close();
    }
}
