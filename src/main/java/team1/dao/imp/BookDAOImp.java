package team1.dao.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import team1.dao.BookDAO;
import team1.entity.Book;

import java.util.List;

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

    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public Book getById(Integer id) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
