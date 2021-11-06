package team1.dao;

import team1.entity.User;
import java.util.List;

public interface UserDAO {
    User add(User user);

    void delete(long id);

    User update(User user);

    User getById(Integer id);

    List<User> getAll();
}
