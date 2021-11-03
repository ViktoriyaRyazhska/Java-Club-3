package team1.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class BookHasAuthorEntityPK implements Serializable {
    private Object bookId;
    private Object authorId;

    @Column(name = "book_id", nullable = false)
    @Id
    public Object getBookId() {
        return bookId;
    }

    public void setBookId(Object bookId) {
        this.bookId = bookId;
    }

    @Column(name = "author_id", nullable = false)
    @Id
    public Object getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Object authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookHasAuthorEntityPK that = (BookHasAuthorEntityPK) o;
        return Objects.equals(bookId, that.bookId) && Objects.equals(authorId, that.authorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, authorId);
    }
}
