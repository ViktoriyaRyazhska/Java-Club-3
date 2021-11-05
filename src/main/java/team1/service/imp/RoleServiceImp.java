package team1.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team1.dao.RoleDAO;
import team1.entity.Role;

import java.util.List;

@Service(value = "roleService")
public class RoleServiceImp implements team1.service.RoleService {

    @Autowired
    RoleDAO roleDAO;

    @Override
    public Role add(Role role) {
        return roleDAO.add(role);
    }

    @Override
    public void delete(long id) {
        roleDAO.delete(id);
    }

    @Override
    public Role update(Role role) {
        return roleDAO.update(role);
    }

    @Override
    public Role getById(long id) {
        return roleDAO.getById(id);
    }

    @Override
    public List<Role> getAll() {
        return roleDAO.getAll();
    }
}
