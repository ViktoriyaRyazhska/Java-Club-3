package com.project.team3.library.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    @OneToOne
    private UserRole userRole;
    private int age;
    private Date registerDate;

    @OneToMany
    private List<BookModel> readBooks;
    @OneToMany
    private List<BookModel> readingBooks;

}
