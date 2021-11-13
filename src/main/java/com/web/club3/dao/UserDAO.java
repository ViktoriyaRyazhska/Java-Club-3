package com.web.club3.dao;

import com.web.club3.model.User;

public interface UserDAO {
    int avgUserAge();

    User findByEmail(String email);
}
