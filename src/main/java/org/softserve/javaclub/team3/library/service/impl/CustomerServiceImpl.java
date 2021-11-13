package org.softserve.javaclub.team3.library.service.impl;

import org.softserve.javaclub.team3.library.dao.CustomerDao;
import org.softserve.javaclub.team3.library.dao.RoleDao;
import org.softserve.javaclub.team3.library.model.Book;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.model.Role;
import org.softserve.javaclub.team3.library.service.BookService;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDaoImpl;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private BookService bookServiceImpl;

    @Autowired
    public void setCustomerDaoImpl(CustomerDao customerDaoImpl) {
        this.customerDaoImpl = customerDaoImpl;
        this.customerDaoImpl.setClazz(Customer.class);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = customerDaoImpl.findByUsername(username);
        if (customer == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return customer;
    }

    public Customer findUserById(String id) {
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
        customer.setRegisterDate(new Date(System.currentTimeMillis()));
        customerDaoImpl.save(customer);
        return true;
    }

    public boolean deleteUser(String id) {
        if (customerDaoImpl.findById(id) != null) {
            customerDaoImpl.removeById(id);
            return true;
        }
        return false;
    }

    public Customer findUserByUsername(String username){
        return customerDaoImpl.findByUsername(username);
    }


}
