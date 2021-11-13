package org.softserve.javaclub.team3.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table
public class BookRequest implements Serializable {

    @Id
    private String id = UUID.randomUUID().toString();

    @OneToOne
    private Book book;
    @OneToOne
    private Customer customer;

    private boolean active;
    private Date creationDate;
    private Date modificationDate;

}
