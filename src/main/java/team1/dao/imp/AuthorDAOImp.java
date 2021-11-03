package team1.dao.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import team1.dao.AuthorDAO;
import team1.entity.Author;

import java.util.List;

@Repository
public class AuthorDAOImp implements AuthorDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public AuthorDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Author add(Author author) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(author);
        transaction.commit();
        session.close();
        return author;
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Author authors = session.get(Author.class, id);
        session.delete(authors);
        transaction.commit();
        session.close();
    }

    @Override
    public Author update(Author author) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(author);
        transaction.commit();
        session.close();
        return author;
    }

    @Override
    public Author getById(Integer id) {
        return sessionFactory.openSession().get(Author.class, id);
    }

    @Override
    public List<Author> getAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT a FROM Author a", Author.class).getResultList();
    }
}
