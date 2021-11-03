package team1.dao;

import java.util.List;

public interface DAO<T> {
    T add(T t);

    void delete(long id);

    T update(T t);

    T getById(Integer id);

    List<T> getAll();
}
