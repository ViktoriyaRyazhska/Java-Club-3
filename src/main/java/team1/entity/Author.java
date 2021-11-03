package team1.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author", schema = "library")
public class Author {
    private Integer id;
    private String name;
    private String surname;
    // private List<BookHasAuthorEntity> bookHasAuthorsById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    //    @OneToMany(mappedBy = "authorByAuthorId")
//    public List<BookHasAuthorEntity> getBookHasAuthorsById() {
//        return bookHasAuthorsById;
//    }
//    @ManyToMany(targetEntity = Author.class, cascade = {CascadeType.ALL})
//    @JoinTable(name = "book_has_author",
//            joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id"))
//    private Set<Book> books;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
