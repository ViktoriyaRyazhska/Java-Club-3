package team1.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "request", schema = "library")
@IdClass(RequestEntityPK.class)
public class Request {
    private Integer id;
    private Integer userId;
    private Integer bookId;
    private String requestStatus;
    private Date requestDate;
    private Date expiredDate;
    private Date actualReturnDate;
    private User userByUserId;
    private Book bookByBookId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "user_id", nullable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "book_id", nullable = false)
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "request_status", nullable = true, length = 45)
    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    @Basic
    @Column(name = "request_date", nullable = true)
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    @Basic
    @Column(name = "expired_date", nullable = true)
    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    @Basic
    @Column(name = "actual_return_date", nullable = true)
    public Date getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(Date actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request that = (Request) o;
        return Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(bookId, that.bookId) && Objects.equals(requestStatus, that.requestStatus) && Objects.equals(requestDate, that.requestDate) && Objects.equals(expiredDate, that.expiredDate) && Objects.equals(actualReturnDate, that.actualReturnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, bookId, requestStatus, requestDate, expiredDate, actualReturnDate);
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    //    @ManyToOne
//    @JoinColumn(name = "book_id", referencedColumnName = "id", nullable = false)
//    public Book getBookByBookId() {
//        return bookByBookId;
//    }
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public void setBookByBookId(Book bookByBookId) {
        this.bookByBookId = bookByBookId;
    }
}
