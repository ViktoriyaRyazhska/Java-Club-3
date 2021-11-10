package org.softserve.javaclub.team3.library.service.impl;

import org.softserve.javaclub.team3.library.dao.CustomerDao;
import org.softserve.javaclub.team3.library.dao.RoleDao;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.model.Role;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDaoImpl;
    @Autowired
    private RoleDao roleDaoImpl;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = customerDaoImpl.findByUsername(username);
        if (customer == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return customer;
    }

    public Customer findUserById(int id) {
        return customerDaoImpl.findById(id);
    }

    public List<Customer> allUsers() {
        return customerDaoImpl.findAll();
    }

    public boolean saveUser(Customer customer) {
        Customer customerFromDb = customerDaoImpl.findByUsername(customer.getUsername());
        if (customerFromDb != null) {
            return false;
        }

        customer.setRole(Collections.singleton(new Role(1, "ROLE_USER")));
        customer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
        customerDaoImpl.save(customer);
        return true;
    }

    public boolean deleteUser(int id) {
        if (customerDaoImpl.findById(id) != null) {
            customerDaoImpl.removeById(id);
            return true;
        }
        return false;
    }

}
