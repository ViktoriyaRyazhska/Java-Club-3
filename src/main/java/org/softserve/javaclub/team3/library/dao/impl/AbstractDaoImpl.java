package org.softserve.javaclub.team3.library.dao.impl;

import com.google.common.base.Preconditions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.softserve.javaclub.team3.library.dao.AbstractDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Repository
@Transactional
public abstract class AbstractDaoImpl<T extends Serializable> extends JdbcDaoSupport implements AbstractDao<T> {

    private static final Logger logger = LoggerFactory.getLogger(AbstractDaoImpl.class);

    @Autowired
    protected SessionFactory sessionFactory;
    private DataSource dataSource;

    @Autowired
    public void setDs(DataSource dataSource) {
        setDataSource(dataSource);
    }

    private Class<T> clazz;

    public void setClazz(final Class<T> clazzToSet) {
        clazz = Preconditions.checkNotNull(clazzToSet);
    }

    //TODO: Convert everything to Optional.

    public T findById(String id) {
        return getCurrentSession().get(clazz, id);
    }

    public List<T> findAll() {
        return getCurrentSession().createQuery("from " + clazz.getName()).list();
    }

    public void save(T entity) {
        Preconditions.checkNotNull(entity);
        getCurrentSession().save(entity);
        logger.info("Save successful. Details: " + entity);
    }

    public void update(T entity) {
        Preconditions.checkNotNull(entity);
        T t = (T) getCurrentSession().merge(entity);
        logger.info("Update successful: Details: " + entity);
    }

    public void remove(T entity) {
        Preconditions.checkNotNull(entity);
        getCurrentSession().delete(entity);
        logger.info("Delete successful: Details: " + entity);
    }

    public void removeById(String entityId) {
        T entity = findById(entityId);
        Preconditions.checkState(entity != null);
        remove(entity);
        logger.info("Delete successful: Details: " + entity);
    }

    public T findByParam(RowMapper<T> rowMapper, String query, String param) {
        Object[] args = {param};
        try {
            return this.getJdbcTemplate().queryForObject(query, args, rowMapper);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public List<T> findListByParam(RowMapper<T> rowMapper, String query, String param) {
        Object[] args = {param};
        try {
            return this.getJdbcTemplate().query(query, args, rowMapper);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public void deleteAllRequests(String query, String param) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(Objects.requireNonNull(getDataSource()));
        jdbcTemplate.update(query, param);
    }


    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
