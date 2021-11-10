package org.softserve.javaclub.team3.library.dao;

import org.softserve.javaclub.team3.library.model.Customer;
import org.springframework.stereotype.Repository;

public interface CustomerDao extends AbstractDao<Customer> {
    Customer findByUsername (String username);
}
