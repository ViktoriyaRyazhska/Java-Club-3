package team1.service;


import team1.entity.User;

import java.util.List;

public interface UserService {
    User add(User user);

    void delete(long id);

    User update(User user);

    User getById(long id);

    List<User> getAll();
}
