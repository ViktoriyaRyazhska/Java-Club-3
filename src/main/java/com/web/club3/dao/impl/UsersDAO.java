package com.web.club3.dao.impl;

import com.web.club3.dao.DAO;
import com.web.club3.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDAO implements DAO<Users> {

    private SessionFactory sessionFactory;

    @Autowired
    public UsersDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Users findById(int id) {
        return sessionFactory.openSession().get(Users.class, id);
    }

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Users create(Users users) {
        return null;
    }

    @Override
    public Users update(Users users) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

}
