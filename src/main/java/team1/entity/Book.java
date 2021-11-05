package team1.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book", schema = "library")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "title", length = 45)
    private String title;

    @Column(name = "total_pages")
    private Integer totalPages;

    @Column(name = "published_date")
    private LocalDate publishedDate;

    @Column(name = "count_of_copies")
    private Integer countOfCopies;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Author.class)
    @JoinTable(name = "book_has_author",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")})
    private Set<Author> author;

    @OneToMany(mappedBy = "book")
    private Set<Request> requests;

}
