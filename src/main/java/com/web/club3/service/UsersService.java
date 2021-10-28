package com.web.club3.service;

import com.web.club3.dao.impl.UsersDAO;
import com.web.club3.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    UsersDAO usersDAO;

    @Autowired
    public UsersService(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    public Users findById(int id) {
        return usersDAO.findById(id);
    }

}
