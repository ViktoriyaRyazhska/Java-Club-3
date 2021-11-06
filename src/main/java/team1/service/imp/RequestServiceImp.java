package team1.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team1.dao.RequestDAO;
import team1.entity.Request;
import team1.service.RequestService;

import java.util.List;

@Service("requestService")
public class RequestServiceImp implements RequestService {

    @Autowired
    RequestDAO requestDAO;

    @Override
    public Request add(Request author) {
        return requestDAO.add(author);
    }

    @Override
    public void delete(long id) {
        requestDAO.delete(id);
    }

    @Override
    public Request update(Request author) {
        return requestDAO.update(author);
    }

    @Override
    public Request getById(long id) {
        return requestDAO.getById(id);
    }

    @Override
    public List<Request> getAll() {
        return requestDAO.getAll();
    }

}
