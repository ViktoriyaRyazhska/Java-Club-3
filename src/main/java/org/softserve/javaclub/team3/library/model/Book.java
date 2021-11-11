package org.softserve.javaclub.team3.library.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
@Data
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private int id;

    private String title;
    private int takenCount;
    private int copies;

    @ManyToOne
    private Author author;
}