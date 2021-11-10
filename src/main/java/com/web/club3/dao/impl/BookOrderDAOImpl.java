package com.web.club3.dao.impl;

import com.web.club3.dao.DAO;
import org.hibernate.SQLQuery;
import com.web.club3.model.BookOrder;
import com.web.club3.dao.BookOrderDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

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
    public List<BookOrder> theMostPopular(LocalDate localDate1, LocalDate localDate2) {
        Session session = sessionFactory.openSession();
// підзапит,парсити BOOK "SELECT fname,lname,isbn from author inner join books on author.AUTHORID = books.AUTHORID"

        SQLQuery query = session.createSQLQuery("Select  COUNT(book_id) as from_most_to_less_popular  FROM book_order where lending_date " +
                "BETWEEN '"+localDate1+ "' AND '"+localDate2+"' GROUP BY book_id ORDER BY from_most_to_less_popular DESC");
        SQLQuery query1 = session.createSQLQuery("Select book_id as from_most_to_less_popular FROM book_order where lending_date " +
                "BETWEEN '"+localDate1+ "' AND '"+localDate2+"' GROUP BY book_id ORDER BY from_most_to_less_popular DESC");

        List results1 = query1.list();
        List results = query.list();
        System.out.println(results1);
        System.out.println(results);

        return results1 ;

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
        Session session = sessionFactory.openSession();
        SQLQuery query = session.createSQLQuery("SELECT user_id, COUNT(user_id) AS how_many_books_are_read \n" +
                "FROM book_order\n" +
                "where return_date is not null \n" +
                "GROUP BY user_id\n" +
                "ORDER BY how_many_books_are_read DESC;");


        List results = query.list();
        System.out.println(results);
        return null;
    }
    @Override
    public void getCountInPeriod(LocalDate localDate1,LocalDate localDate2)
    {
        Session session = sessionFactory.openSession();
        SQLQuery query1 = session.createSQLQuery("select count(book_id) from book_order where lending_date BETWEEN '"+localDate1+ "' AND '"+localDate2+"'");
        List results1 = query1.list();
        System.out.println(results1);
    }

    @Override
    public void averageTimeOfReadingBook(int id) {

        Session session = sessionFactory.openSession();
        SQLQuery query1 = session.createSQLQuery("SELECT avg (DATEDIFF(return_date, lending_date)) AS 'AVG_Days'\n" +
                "FROM book_order\n" +
                "WHERE book_id = " + id +
                " group by 'AVG_Days';");
        List results1 = query1.list();
        System.out.println(results1);
    }


}
