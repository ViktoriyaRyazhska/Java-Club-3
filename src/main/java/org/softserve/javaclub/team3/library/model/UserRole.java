package org.softserve.javaclub.team3.library.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String role;
}