package org.softserve.javaclub.team3.library.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "book")
@Data
public class Book implements Serializable {

    @Id
    @Column(name = "book_id")
    private String id = UUID.randomUUID().toString();

    private String title;
    private int takenCount;
    private int copies;

    @ManyToOne
    private Author author;
}