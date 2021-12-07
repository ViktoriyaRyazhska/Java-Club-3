package org.softserve.javaclub.team3.library.service;

import org.softserve.javaclub.team3.library.dto.CustomerDto;
import org.softserve.javaclub.team3.library.model.Customer;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface CustomerService extends UserDetailsService {

    Customer findUserById(String id);

    List<Customer> allUsers();

    boolean saveUser(CustomerDto customerDto);

    void deleteUser(String id);

    Customer findUserByUsername(String username);

    boolean validatePassword(String requestPassword, String correctPassword);
}
