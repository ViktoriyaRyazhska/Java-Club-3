package team1.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "request", schema = "library")

public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "request_status", length = 45)
    private String requestStatus;

    @Column(name = "request_date")
    private LocalDate requestDate;

    @Column(name = "expired_date")
    private LocalDate expiredDate;

    @Column(name = "actual_return_date")
    private LocalDate actualReturnDate;

}