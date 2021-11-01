package org.softserve.javaclub.team3.library.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

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
    private List<Book> readBooks;
    @OneToMany
    private List<Book> readingBooks;

}