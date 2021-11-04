package org.softserve.javaclub.team3.library.dao.impl;

import org.softserve.javaclub.team3.library.dao.CustomerDao;
import org.softserve.javaclub.team3.library.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomerDaoImpl extends AbstractDao<Customer> implements CustomerDao {

}
