package team1.service;

import team1.entity.Request;
import team1.entity.Role;

import java.util.List;

public interface RequestService {
    Request add(Request request);

    void delete(long id);

    Request update(Request request);

    Request getById(long id);

    List<Request> getAll();
}
