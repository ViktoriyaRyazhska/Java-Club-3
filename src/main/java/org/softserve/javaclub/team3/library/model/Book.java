package org.softserve.javaclub.team3.library.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private int takenCount;
    private int copies;

    @ManyToOne
    private Author author;
}