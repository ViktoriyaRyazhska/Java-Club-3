package team1.dao.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team1.dao.BookDAO;
import team1.entity.Book;

import java.util.List;

@Repository
public class BookDAOImp implements BookDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public BookDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Book add(Book book) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
        return book;
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Book books = session.get(Book.class, id);
        session.delete(books);
        transaction.commit();
        session.close();
    }

    @Override
    public Book update(Book book) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(book);
        transaction.commit();
        session.close();
        return book;
    }

    @Override
    public Book getById(long id) {
        return sessionFactory.openSession().get(Book.class, id);
    }

    @Override
    public List<Book> getAll() {

        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }
}
