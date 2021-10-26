package com.project.team3.library.model;

import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.List;

@Entity(name = "book")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private boolean bookAvailable;
    private int takenCount;
    private int copies;

    @ManyToOne
    private Author author;
}
