package team1.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "book_has_author", schema = "library")
@IdClass(BookHasAuthorEntityPK.class)
public class BookHasAuthorEntity {
    private Integer  bookId;
    private Integer  authorId;
    private String authorStatus;
    private Book bookByBookId;
    private Author authorByAuthorId;

    @Id
    @Column(name = "book_id", nullable = false)
    public Integer  getBookId() {
        return bookId;
    }

    public void setBookId(Integer  bookId) {
        this.bookId = bookId;
    }

    @Id
    @Column(name = "author_id", nullable = false)
    public Integer  getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer  authorId) {
        this.authorId = authorId;
    }

    @Basic
    @Column(name = "author_status", nullable = true, length = 45)
    public String getAuthorStatus() {
        return authorStatus;
    }

    public void setAuthorStatus(String authorStatus) {
        this.authorStatus = authorStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookHasAuthorEntity that = (BookHasAuthorEntity) o;
        return Objects.equals(bookId, that.bookId) && Objects.equals(authorId, that.authorId) && Objects.equals(authorStatus, that.authorStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, authorId, authorStatus);
    }

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id", nullable = false)
    public Book getBookByBookId() {
        return bookByBookId;
    }

    public void setBookByBookId(Book bookByBookId) {
        this.bookByBookId = bookByBookId;
    }

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
    public Author getAuthorByAuthorId() {
        return authorByAuthorId;
    }

    public void setAuthorByAuthorId(Author authorByAuthorId) {
        this.authorByAuthorId = authorByAuthorId;
    }
}
