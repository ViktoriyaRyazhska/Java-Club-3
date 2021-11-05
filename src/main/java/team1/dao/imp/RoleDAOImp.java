package team1.dao.imp;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team1.dao.RoleDAO;
import team1.entity.Role;
import java.util.List;

@Repository
public class RoleDAOImp implements RoleDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public RoleDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Role add(Role role) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(role);
        transaction.commit();
        session.close();
        return role;
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Role roles = session.get(Role.class, id);
        session.delete(roles);
        transaction.commit();
        session.close();
    }

    @Override
    public Role update(Role role) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(role);
        transaction.commit();
        session.close();
        return role;
    }

    @Override
    public Role getById(long id) {
        return sessionFactory.openSession().get(Role.class, id);
    }

    @Override
    public List<Role> getAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT r FROM Role r", Role.class).getResultList();
    }
}
