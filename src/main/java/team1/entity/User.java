package team1.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "library")
public class User {
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Date dateOfBirth;
    private Date registrationDate;
    private Object roleId;
    private Collection<Request> requestsById;
    private Role roleByRoleId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname", nullable = true, length = 45)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 120)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "date_of_birth", nullable = true)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "registration_date", nullable = true)
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Basic
    @Column(name = "role_id", nullable = false)
    public Object getRoleId() {
        return roleId;
    }

    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(registrationDate, that.registrationDate) && Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, password, dateOfBirth, registrationDate, roleId);
    }

    @OneToMany(mappedBy = "user")
    private List<Request> bookOrderList;

    public void setRequestsById(Collection<Request> requestsById) {
        this.requestsById = requestsById;
    }

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public void setRoleByRoleId(Role roleByRoleId) {
        this.roleByRoleId = roleByRoleId;
    }
}
