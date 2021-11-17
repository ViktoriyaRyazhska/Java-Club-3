package com.web.club3.model;

import com.web.club3.util.LocalDatePersistenceConverter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book_order")
public class BookOrder {
    @Id
    @Column(name = "book_order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "lending_date")
    @Convert(converter = LocalDatePersistenceConverter.class)
    private LocalDate lendingDate;

    @Column(name = "return_date")
    @Convert(converter = LocalDatePersistenceConverter.class)
    private LocalDate returnDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getLendingDate() {
        return lendingDate;
    }

    public void setLendingDate(LocalDate lendingDate) {
        this.lendingDate = lendingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BookOrder{" +
                "id=" + id +
                ", user=" + user +
                ", book=" + book +
                ", lendingDate=" + lendingDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
