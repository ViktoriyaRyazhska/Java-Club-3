package com.project.team3.library.model;

import javax.persistence.*;

@Entity(name = "role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String role;
}
