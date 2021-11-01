package org.softserve.javaclub.team3.library.dao.impl;

import com.google.common.base.Preconditions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractDaoImpl<T extends Serializable> {

    private static final Logger logger = LoggerFactory.getLogger(AbstractDaoImpl.class);

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> clazz;

    public void setClazz(final Class<T> clazzToSet) {
        clazz = Preconditions.checkNotNull(clazzToSet);
    }

    protected T findById(int id) {
        return getCurrentSession().get(clazz, id);
    }

    protected List<T> findAll(){
        return getCurrentSession().createQuery("from " + clazz.getName()).list();
    }

    protected T save(T entity) {
        Preconditions.checkNotNull(entity);
        getCurrentSession().save(entity);
        logger.info("Save successful. Details: " + entity);
        return entity;
    }

    protected T update(T entity) {
        Preconditions.checkNotNull(entity);
        T t = (T) getCurrentSession().merge(entity);
        logger.info("Update successful: Details: " + entity);
        return t;
    }

    protected void remove(T entity) {
        Preconditions.checkNotNull(entity);
        getCurrentSession().delete(entity);
        logger.info("Delete successful: Details: " + entity);
    }

    protected void removeById(int entityId) {
        T entity = findById(entityId);
        Preconditions.checkState(entity != null);
        remove(entity);
        logger.info("Delete successful: Details: " + entity);
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
