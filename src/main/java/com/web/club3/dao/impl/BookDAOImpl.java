package com.web.club3.dao.impl;

import com.web.club3.dao.BookDAO;
import com.web.club3.dao.DAO;
import com.web.club3.model.Author;
import com.web.club3.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookDAOImpl implements DAO<Book>, BookDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public BookDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Book findById(int id) {
        return sessionFactory.openSession().get(Book.class, id);
    }

    @Override
    public List<Book> findAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("Select b from Book b", Book.class).getResultList();
    }

    @Override
    public Book create(Book book) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
        return book;
    }

    @Override
    public Book update(Book book) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(book);
        tx1.commit();
        session.close();
        return book;
    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        Book book = session.get(Book.class, id);
        session.delete(book);
        tx1.commit();
        session.close();
    }

    @Override
    public boolean available(int id) {
        Book book = (Book) sessionFactory.openSession().createQuery("FROM Book WHERE book_id =" + id).getSingleResult();
        return null != book && book.getCopies() > 0;
    }

    @Override
    public List<Book> findByAuthor(Author author) {
        return sessionFactory.openSession().createQuery("From Book", Book.class).getResultList().stream()
                .filter(x -> x.getAuthor().stream().anyMatch(y -> y.getId() == author.getId())).collect(Collectors.toList());
    }

    @Override
    public Book findByTitle(String title) {
        return sessionFactory.openSession().createQuery("From Book where title = '" + title + "'", Book.class).getSingleResult();
    }

    @Override
    public void updateCopiesById(int id, int copies) {
        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();
        Query updateQuery =
                session.createQuery("UPDATE Book SET copies =" + copies + " WHERE book_id =" + id);
        updateQuery.executeUpdate();
        txn.commit();
    }

    @Override
    public void deleteOneCopy(int bookId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("Update Book set copies = copies - 1 where id = :bookId");
        q.setParameter("bookId", bookId);
        q.executeUpdate();
        transaction.commit();
        session.close();
    }

    @Override
    public void addOneCopy(int bookId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("Update Book set copies = copies + 1 where id = :bookId");
        q.setParameter("bookId", bookId);
        q.executeUpdate();
        transaction.commit();
        session.close();
    }

    @Override
    public int getCopiesById(int id) {
        return sessionFactory.openSession().createQuery("From Book WHERE book_id =" + id, Book.class).getSingleResult().getCopies();
    }
}
