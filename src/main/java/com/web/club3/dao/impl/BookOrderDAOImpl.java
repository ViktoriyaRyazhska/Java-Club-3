package com.web.club3.dao.impl;

import com.web.club3.dao.DAO;
import com.web.club3.model.BookOrder;
import com.web.club3.dao.BookOrderDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookOrderDAOImpl implements DAO<BookOrder>, BookOrderDAO {

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
    public Long getCountInPeriod(LocalDate startDate, LocalDate endDate) {
        Session session = sessionFactory.openSession();
        TypedQuery<Long> query = session.createQuery("select count(book.id) from BookOrder where lendingDate BETWEEN :startDate and :endDate ", Long.class);
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);
        Long result = query.getSingleResult();
        session.close();
        return result;
    }

    @Override
    public String averageTimeOfUserReadSingleBook(int userId) {
        Session session = sessionFactory.openSession();

        TypedQuery<LocalDate> lendingDate = session.createQuery("SELECT lendingDate" +
                " FROM BookOrder\n" +
                " WHERE user.id = :userId");
        TypedQuery<LocalDate> returnDate = session.createQuery("SELECT returnDate" +
                " FROM BookOrder\n" +
                " WHERE user.id = :userId and returnDate is not null");

        lendingDate.setParameter("userId", userId);
        returnDate.setParameter("userId", userId);

        List<LocalDate> lendinglist = ((Query<LocalDate>) lendingDate).list();
        List<LocalDate> returnlist = ((Query<LocalDate>) returnDate).list();

        int sizeofreturnlist = returnlist.size();

        String result = "";
        for (int i = 0; i < sizeofreturnlist; i++) {
            Long sum = ChronoUnit.DAYS.between(lendinglist.get(i), returnlist.get(i));
            result += lendinglist.get(i) + "     " + returnlist.get(i) + "     " + sum + "\n";
        }

        session.close();
        return result;
    }

    @Override
    public Double averageTimeOfReadingBook(int bookId) {
        Session session = sessionFactory.openSession();

        TypedQuery<LocalDate> lendingDate = session.createQuery("SELECT lendingDate" +
                " FROM BookOrder\n" +
                " WHERE book.id = :bookId");
        TypedQuery<LocalDate> returnDate = session.createQuery("SELECT returnDate" +
                " FROM BookOrder\n" +
                " WHERE book.id = :bookId and returnDate is not null");

        lendingDate.setParameter("bookId", bookId);
        returnDate.setParameter("bookId", bookId);

        List<LocalDate> lendinglist = ((Query<LocalDate>) lendingDate).list();
        List<LocalDate> returnlist = ((Query<LocalDate>) returnDate).list();

        Long sum = 0L;
        int sizeofreturnlist = returnlist.size();

        for (int i = 0; i < sizeofreturnlist; i++) {
            sum += ChronoUnit.DAYS.between(lendinglist.get(i), returnlist.get(i));
        }

        Double result = (double) sum / sizeofreturnlist;
        session.close();
        return result;
    }


    public Long howManyBooksUserRead(int userId) {
        Session session = sessionFactory.openSession();
        TypedQuery<Long> query = session.createQuery("select count(user.id) as numberOfBooks from BookOrder where returnDate is not null AND user.id = :userId group by user.id", Long.class);
        query.setParameter("userId", userId);
        Long result = query.getSingleResult();
        session.close();
        return result;
    }

    public Long howManyBooksAreReading(int userId) {
        Session session = sessionFactory.openSession();
        TypedQuery<Long> query = session.createQuery("select count(user.id) as numberOfReadingBooks from BookOrder where returnDate is null and user.id = :userId group by user.id", Long.class);
        query.setParameter("userId", userId);
        Long result = query.getSingleResult();
        session.close();
        return result;
    }

    public Long howManyRequestUserDidToLibrary(int userId, LocalDate startDate, LocalDate endDate) {
        Session session = sessionFactory.openSession();
        TypedQuery<Long> query = session.createQuery("select count(user.id) as numberOfRequests from BookOrder where user.id = :userId and lendingDate BETWEEN :startDate and :endDate group by user.id", Long.class);
        query.setParameter("userId", userId);
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);
        Long result = query.getSingleResult();
        session.close();
        return result;
    }

    public String fromTheMostPopularToTheLessPopularBook(LocalDate startDate, LocalDate endDate) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select book.id, count(book.id) as rating from BookOrder where lendingDate between :startDate and :endDate group by book.id order by rating desc");
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);
        List<Object[]> resultList = query.list();
        StringBuilder resultString = new StringBuilder();
        for (Object[] row : resultList) {
            resultString.append(Arrays.toString(row));
        }
        session.close();
        return resultString.toString();
    }

    public BookOrder returnBook(BookOrder bookOrder) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("UPDATE BookOrder SET returnDate = current_date() WHERE id = :bookOrderId ");
        query.setParameter("bookOrderId", bookOrder.getId());
        query.executeUpdate();
        transaction.commit();
        session.close();
        return bookOrder;
    }

    public List<BookOrder> readBooksInCertainDays(int days) {
        Session session = sessionFactory.openSession();
        return session.createQuery("select b FROM BookOrder b INNER JOIN b.user where datediff(b.returnDate,b.lendingDate)>= " + days).getResultList();
    }
}
