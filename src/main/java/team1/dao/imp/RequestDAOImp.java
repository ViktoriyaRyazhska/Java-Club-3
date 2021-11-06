package team1.dao.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import team1.dao.RequestDAO;
import team1.entity.Request;

import java.util.List;

@Repository
public class RequestDAOImp implements RequestDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public RequestDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Request add(Request request) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(request);
        transaction.commit();
        session.close();
        return request;
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Request authors = session.get(Request.class, id);
        session.delete(authors);
        transaction.commit();
        session.close();
    }

    @Override
    public Request update(Request author) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(author);
        transaction.commit();
        session.close();
        return author;
    }

    @Override
    public Request getById(long id) {
        return sessionFactory.openSession().get(Request.class, id);
    }

    @Override
    public List<Request> getAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT r FROM Request r", Request.class).getResultList();
    }
}
