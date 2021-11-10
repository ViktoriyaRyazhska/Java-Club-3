package org.softserve.javaclub.team3.library.dao.mapper;

import org.softserve.javaclub.team3.library.model.Customer;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
        final Customer customer = new Customer();
        customer.setId(resultSet.getInt("id"));
        customer.setUsername(resultSet.getString("username"));
        customer.setPassword(resultSet.getString("password"));

        return customer;
    }
}
