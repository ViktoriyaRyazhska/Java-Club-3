package org.softserve.javaclub.team3.library.dao.impl;

import org.softserve.javaclub.team3.library.dao.CustomerDao;
import org.softserve.javaclub.team3.library.dao.mapper.CustomerRowMapper;
import org.softserve.javaclub.team3.library.model.Customer;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomerDaoImpl extends AbstractDaoImpl<Customer> implements CustomerDao {

    private static final String FIND_CUSTOMER_BY_USERNAME_QUERY = "SELECT * FROM Customer AS c " +
            "JOIN customer_role cr on c.id = cr.Customer_id " +
            "JOIN role r on r.id = cr.role_id WHERE username =  ?";

    private final RowMapper<Customer> customerRowMapper;

    public CustomerDaoImpl() {
        customerRowMapper = new CustomerRowMapper();
    }

    @Override
    public Customer findByUsername(String username) {
        return findByParam(customerRowMapper, FIND_CUSTOMER_BY_USERNAME_QUERY, username);
    }

}
