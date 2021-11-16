package com.web.club3.model;

import com.web.club3.util.LocalDatePersistenceConverter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_surname")
    private String surname;

    private String email;
    private int age;

    @Column(name = "user_password", nullable = false)
    private String password;

    @Column(name = "registration_date")
    @Convert(converter = LocalDatePersistenceConverter.class)
    private LocalDate date;

    @Column(name = "user_role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user")
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
        return ", age=" + age +
                ", date=" + date +
                '}';
    }
}
