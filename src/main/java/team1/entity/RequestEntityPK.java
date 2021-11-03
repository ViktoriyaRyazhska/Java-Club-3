package team1.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RequestEntityPK implements Serializable {
    private Object id;
    private Object userId;
    private Object bookId;

    @Column(name = "id", nullable = false)
    @Id
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Column(name = "user_id", nullable = false)
    @Id
    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    @Column(name = "book_id", nullable = false)
    @Id
    public Object getBookId() {
        return bookId;
    }

    public void setBookId(Object bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestEntityPK that = (RequestEntityPK) o;
        return Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, bookId);
    }
}
