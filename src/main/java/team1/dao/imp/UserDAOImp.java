package team1.dao.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team1.dao.UserDAO;
import team1.entity.User;

import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User add(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
        return user;
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User users = session.get(User.class, id);
        session.delete(users);
        transaction.commit();
        session.close();
    }

    @Override
    public User update(User user) {Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
        return user;
    }

    @Override
    public User getById(long id) {
        return sessionFactory.openSession().get(User.class, id);
    }

    @Override
    public List<User> getAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT u FROM User u", User.class).getResultList();
    }
}
