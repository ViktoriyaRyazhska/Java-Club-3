package team1.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team1.dao.UserDAO;
import team1.entity.User;
import team1.service.UserService;

import java.util.List;

@Service(value = "userService")
public class UserServiceImp implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public User add(User user) { return userDAO.add(user); }

    @Override
    public void delete(long id) { userDAO.delete(id); }

    @Override
    public User update(User user) {return userDAO.update(user);}

    @Override
    public User getById(long id) {return userDAO.getById(id);}

    @Override
    public List<User> getAll() {
        return userDAO.getAll();
    }
}
