package team1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book", schema = "library")
public class Book {
    private Integer id;
    private String title;
    private Integer totalPages;
    private Date publishedDate;
    private Integer countOfCopies;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 45)
    public String getTitle() {
        return title;
    }

    @Basic
    @Column(name = "total_pages", nullable = true)
    public Integer getTotalPages() {
        return totalPages;
    }


    @Basic
    @Column(name = "published_date", nullable = true)
    public Date getPublishedDate() {
        return publishedDate;
    }

    @Basic
    @Column(name = "count_of_copies", nullable = true)
    public Integer getCountOfCopies() {
        return countOfCopies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(totalPages, that.totalPages) && Objects.equals(publishedDate, that.publishedDate) && Objects.equals(countOfCopies, that.countOfCopies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, totalPages, publishedDate, countOfCopies);
    }

//    @ManyToMany(targetEntity = Author.class, cascade = {CascadeType.ALL})
//    @JoinTable(name = "book_has_author",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "author_id"))
//    private Set<BookHasAuthorEntity> bookHasAuthorEntities;
//
//    @OneToMany(mappedBy = "book")
//    private List<Request> requestList;

}
