package com.web.club3.dto;

import com.web.club3.model.BookOrder;
import com.web.club3.model.Role;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class UserDTO {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private String password;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private Role role;
    private List<BookOrder> bookOrderList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<BookOrder> getBookOrderList() {
        return bookOrderList;
    }

    public void setBookOrderList(List<BookOrder> bookOrderList) {
        this.bookOrderList = bookOrderList;
    }

    @Override
    public String toString() {
        return name  + surname;
    }
}
