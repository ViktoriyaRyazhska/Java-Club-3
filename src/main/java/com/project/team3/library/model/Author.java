package com.project.team3.library.model;

import javax.persistence.*;

@Entity(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
}
