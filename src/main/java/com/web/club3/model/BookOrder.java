package com.web.club3.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book_order")
public class BookOrder {
    @Id
    @Column(name = "book_order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "book_order_id")
    private Users users;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "book_order_id")
    private Book book;

    @Column(name = "lending_date")
    private Date lendingDate;

    @Column(name = "return_date")
    private Date returnDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getLendingDate() {
        return lendingDate;
    }

    public void setLendingDate(Date lendingDate) {
        this.lendingDate = lendingDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "BookOrder{" +
                "id=" + id +
                ", users=" + users +
                ", book=" + book +
                ", lendingDate=" + lendingDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
