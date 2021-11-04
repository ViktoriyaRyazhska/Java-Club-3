package org.softserve.javaclub.team3.library.dao.impl;

import org.softserve.javaclub.team3.library.dao.UserRoleDao;
import org.softserve.javaclub.team3.library.model.UserRole;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserRoleDaoImpl extends AbstractDao<UserRole> implements UserRoleDao {

}
