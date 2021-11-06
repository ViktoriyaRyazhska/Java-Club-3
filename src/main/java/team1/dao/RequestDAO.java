package team1.dao;

import team1.entity.Request;

import java.util.List;

public interface RequestDAO {
    Request add(Request request);

    void delete(long id);

    Request update(Request request);

    Request getById(long id);

    List<Request> getAll();
}
