package com.web.club3.dao.impl;

import com.web.club3.dao.DAO;
import com.web.club3.dao.UserDAO;
import com.web.club3.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements DAO<User>, UserDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public User findById(int id) {
        return sessionFactory.openSession().get(User.class, id);
    }

    @Override
    public List<User> findAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT a FROM User a", User.class).getResultList();
    }

    @Override
    public User create(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
        return user;
    }

    @Override
    public User update(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
        return user;
    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User users = session.get(User.class, id);
        session.delete(users);
        transaction.commit();
        session.close();
    }

    @Override
    public int avgUserAge() {
        Session session = sessionFactory.openSession();
        double avgAge = (double) session.createQuery("select avg (age) from User ").getSingleResult();
        return (int) avgAge;
    }

    @Override
    public User findByEmail(String email) {
        return (User) sessionFactory.openSession().createQuery("from User where email = :email").setParameter("email", email).getSingleResult();
    }
}
