package com.web.club3.service.impl;

import com.web.club3.dao.impl.UserDAOImpl;
import com.web.club3.dto.UserDTO;
import com.web.club3.model.Role;
import com.web.club3.model.User;
import com.web.club3.service.CRUDService;
import com.web.club3.service.UserService;
import com.web.club3.util.DateUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements CRUDService<UserDTO>, UserService {

    private final UserDAOImpl userDAO;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserDAOImpl userDAO, BCryptPasswordEncoder bCryptPasswordEncoder, ModelMapper modelMapper) {
        this.userDAO = userDAO;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDTO findById(int id) {
        User user = userDAO.findById(id);
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users = userDAO.findAll();
        return users.stream().map(u -> modelMapper.map(u, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setDate(LocalDate.now());
        user.setRole(Role.USER);
        return modelMapper.map(userDAO.create(user), UserDTO.class);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return modelMapper.map(userDAO.update(user), UserDTO.class);
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
        return DateUtil.differenceBetweenTwoDates(registrationDate, localDate);
    }

    @Override
    public UserDTO findByEmail(String email) {
        User user = userDAO.findByEmail(email);
        return modelMapper.map(user, UserDTO.class);
    }
}
