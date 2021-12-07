package org.softserve.javaclub.team3.library.service.impl;

import org.softserve.javaclub.team3.library.dao.CustomerDao;
import org.softserve.javaclub.team3.library.dto.CustomerDto;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.model.Role;
import org.softserve.javaclub.team3.library.service.BookRequestService;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.acls.model.NotFoundException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDaoImpl;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private BookRequestService bookRequestServiceImpl;

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

    @Override
    public Customer findUserById(String id) {
        return customerDaoImpl.findById(id);
    }

    @Override
    public List<Customer> allUsers() {
        return customerDaoImpl.findAll();
    }

    @Override
    public boolean saveUser(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setUsername(customerDto.getUsername());
        customer.setPassword(customerDto.getPassword());
        customer.setAge(customerDto.getAge());

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

    @Override
    public void deleteUser(String id) {
        bookRequestServiceImpl.returnAllBooks(id);
        customerDaoImpl.removeById(id);
    }

    @Override
    public Customer findUserByUsername(String username) {
        Optional<Customer> entry = Optional.ofNullable(customerDaoImpl.findByUsername(username));
        if (entry.isEmpty()) {
            throw new NotFoundException("User not found");
        } else {
            return entry.get();
        }
    }

    @Override
    public boolean validatePassword(String requestPassword, String correctPassword) {
        return bCryptPasswordEncoder.matches(requestPassword, correctPassword);
    }
}
