package team1.dao;

import team1.entity.Book;
import team1.entity.Role;

import java.util.List;

public interface RoleDAO {
    Role add(Role role);

    void delete(long id);

    Role update(Role role);

    Role getById(long id);

    List<Role> getAll();
}
