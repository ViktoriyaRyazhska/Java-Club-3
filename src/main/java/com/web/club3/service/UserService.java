package com.web.club3.service;

import com.web.club3.model.User;

import java.util.List;

public interface UserService {
    User findById(int id);

    List<User> findAll();

    User create(User user);

    User update(User user);

    void deleteById(int id);
}
