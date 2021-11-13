package org.softserve.javaclub.team3.library.dao;

import java.io.Serializable;
import java.util.List;

public interface AbstractDao<T extends Serializable> {
    void setClazz(final Class<T> clazzToSet);
    T findById(String id);
    List<T> findAll();
    void save(T entity);
    void update(T entity);
    void remove(T entity);
    void removeById(String entityId);
}
