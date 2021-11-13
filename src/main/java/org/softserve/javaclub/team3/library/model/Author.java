package org.softserve.javaclub.team3.library.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "author")
@Data
public class Author implements Serializable {

    @Id
    @Column(name = "author_id")
    private String id = UUID.randomUUID().toString();

    private String name;
    private String surname;
}