package com.web.club3.service.impl;

import com.web.club3.dao.impl.UserDAOImpl;
import com.web.club3.model.User;
import com.web.club3.service.CRUDService;
import com.web.club3.service.UserService;
import com.web.club3.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImpl implements CRUDService<User>, UserService {

    private UserDAOImpl userDAO;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserDAOImpl userDAO, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userDAO = userDAO;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User create(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userDAO.create(user);
    }

    @Override
    public User update(User user) {
        return userDAO.update(user);
    }

    @Override
    public void deleteById(int id) {
        userDAO.deleteById(id);
    }

    @Override
    public int avgUserAge() {
        return userDAO.avgUserAge();
    }

    @Override
    public String howLongUserWorkWithLibrary(LocalDate registrationDate, LocalDate localDate) {
        return DateUtil.differenceBetweenTwoDates(registrationDate, DateUtil.localDate);
    }
}
