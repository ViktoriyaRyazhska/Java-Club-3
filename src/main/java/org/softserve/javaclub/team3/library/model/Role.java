package org.softserve.javaclub.team3.library.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "role")
@Data
public class Role implements Serializable, GrantedAuthority {
    @Id
    private int id;
    private String name;
    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<Customer> users;

    @Override
    public String getAuthority() {
        return getName();
    }

    public Role(int id, String name){
        this.id = id;
        this.name = name;
    }
}