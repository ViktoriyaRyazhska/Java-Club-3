package com.web.club3.dao;

import com.web.club3.model.User;

import java.util.List;

public interface UserDAO {
    User findById(int id);

    List<User> findAll();

    User create(User user);

    User update(User user);

    void deleteById(int id);
}
