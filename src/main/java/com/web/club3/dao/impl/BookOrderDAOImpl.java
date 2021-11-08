package com.web.club3.dao.impl;

import com.web.club3.dao.DAO;
import org.hibernate.SQLQuery;
import org.hibernate.query.Query;
import com.web.club3.model.Book;
import com.web.club3.model.BookOrder;
import com.web.club3.dao.BookOrderDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Repository
public class BookOrderDAOImpl implements DAO<BookOrder>,BookOrderDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public BookOrderDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public BookOrder findById(int id) {
        return sessionFactory.openSession().get(BookOrder.class, id);
    }

    @Override
    public List<BookOrder> findAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT a FROM BookOrder a", BookOrder.class).getResultList();
    }

    @Override
    public BookOrder create(BookOrder bookOrder) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bookOrder);
        transaction.commit();
        session.close();
        return bookOrder;
    }

    @Override
    public BookOrder update(BookOrder bookOrder) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(bookOrder);
        transaction.commit();
        session.close();
        return bookOrder;
    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        BookOrder bookOrder = session.get(BookOrder.class, id);
        session.delete(bookOrder);
        transaction.commit();
        session.close();
    }

    @Override
    public Long theMostPopular(LocalDate localDate1, LocalDate localDate2) {
        Session session = sessionFactory.openSession();

        long avgAge = (long) session.createQuery("Select COUNT (book_id) as from_most_to_less_popular FROM BookOrder b  where lending_date " +
                "BETWEEN '"+localDate1+ "' AND '"+localDate2+"' GROUP BY book_id ORDER BY from_most_to_less_popular DESC").getSingleResult();
        return  avgAge;
    }
    @Override
    public List<BookOrder> test(LocalDate localDate1, LocalDate localDate2) {
        Session session = sessionFactory.openSession();

        SQLQuery query = session.createSQLQuery("Select  COUNT(*) as from_most_to_less_popular FROM book_order where lending_date " +
                "BETWEEN '"+localDate1+ "' AND '"+localDate2+"' GROUP BY book_id ORDER BY from_most_to_less_popular DESC");
       // query.addEntity("b", BookOrder.class);
        List<BookOrder> results = query.list();
        return results;
/*
       Query query =  sessionFactory.openSession().createQuery("Select :book_id,COUNT (book_id) as from_most_to_less_popular FROM BookOrder b where lending_date " +
                "BETWEEN '"+localDate1+ "' AND '"+localDate2+"' GROUP BY book_id ORDER BY from_most_to_less_popular DESC");
        List<BookOrder> users = query.list();
        return users;
 */

/*
        Query query = sessionFactory.openSession().createQuery("FROM BookOrder");
       // query.setParameter("book_order_id", "book_order_id");
        List users = query.list();
        return users;
 */
    }
    @Override
    public BookOrder test2(int id) {

        return sessionFactory.openSession().createQuery("From BookOrder where book_order_id = " + id ,BookOrder.class).getSingleResult();
    }
/*
    @Override
    public void returnBook(int bookId) {
        Session session = sessionFactory.openSession();
        Query q  = session.createQuery("update book_order set return_date = '20211024' where book_order_id = 8;" +
                "update book set copies = 4 where book_id = :bookId");
        session.delete(bookOrder);
        transaction.commit();
        session.close();
    }

 */



}
