package org.softserve.javaclub.team3.library.dao.mapper;

import org.softserve.javaclub.team3.library.model.Book;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.model.Role;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
        final Customer customer = new Customer();
        customer.setId(resultSet.getString("Customer_id"));
        customer.setUsername(resultSet.getString("username"));
        customer.setPassword(resultSet.getString("password"));
        customer.setAge(resultSet.getInt("age"));
        customer.setRegisterDate(resultSet.getDate("registerDate"));


        final Set<Role> roles = new HashSet<>();
        final Role role = new Role();
        role.setId(resultSet.getInt("role_id"));
        role.setName(resultSet.getString("name"));
        roles.add(role);
        customer.setRole(roles);

        return customer;
    }
}
