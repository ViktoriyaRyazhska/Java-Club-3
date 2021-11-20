package com.web.club3.dto;

import com.web.club3.model.Book;
import com.web.club3.model.User;

import java.time.LocalDate;

public class BookOrderDTO {
    private int id;
    private User user;
    private Book book;
    private LocalDate lendingDate;
    private LocalDate returnDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
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

    @Override
    public String toString() {
        return "id=" + id +
                ", user=" + user +
                ", book=" + book +
                ", lendingDate=" + lendingDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
