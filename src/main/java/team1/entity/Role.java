package team1.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.lang.Object;

@Entity
@Table(name = "role", schema = "library")
public class Role {
    private Integer  id;
    private String roleName;
    private Collection<User> usersById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(Integer  id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role_name", length = 45)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role that = (Role) o;
        return Objects.equals(id, that.id) && Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName);
    }

    @OneToMany(mappedBy = "role")
    private List<User> user;

    public void setUsersById(Collection<User> usersById) {
        this.usersById = usersById;
    }
}
