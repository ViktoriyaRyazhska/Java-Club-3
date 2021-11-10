package org.softserve.javaclub.team3.library.service;

import org.softserve.javaclub.team3.library.model.Customer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService extends UserDetailsService {

    Customer findUserById(int id);
    List<Customer> allUsers();
    boolean saveUser(Customer customer);
    boolean deleteUser(int id);
}
