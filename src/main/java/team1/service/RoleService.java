package team1.service;

import team1.entity.Role;

import java.util.List;

public interface RoleService {
    Role add(Role role);

    void delete(long id);

    Role update(Role role);

    Role getById(long id);

    List<Role> getAll();
}
