package org.softserve.javaclub.team3.library.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private int takenCount;
    private int copies;

    @ManyToOne
    private Author author;
}