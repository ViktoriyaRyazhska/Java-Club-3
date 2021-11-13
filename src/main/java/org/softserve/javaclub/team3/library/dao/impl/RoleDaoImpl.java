package org.softserve.javaclub.team3.library.dao.impl;

import org.softserve.javaclub.team3.library.dao.RoleDao;
import org.softserve.javaclub.team3.library.model.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class RoleDaoImpl extends AbstractDaoImpl<Role> implements RoleDao {
    @Override
    public Role findById(String id){
        return getCurrentSession().get(Role.class, Integer.valueOf(id));
    }
}
