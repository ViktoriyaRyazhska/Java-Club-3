package com.web.club3.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    private int copies;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToMany(targetEntity = Author.class, cascade = {CascadeType.ALL})
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> author;

    @OneToMany(mappedBy = "book")
    private List<BookOrder> bookOrderList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    public List<BookOrder> getBookOrderList() {
        return bookOrderList;
    }

    public void setBookOrderList(List<BookOrder> bookOrderList) {
        this.bookOrderList = bookOrderList;
    }

    @Override
    public String toString() {
        return "\n Book: title='" + title + '\'' +
                ", copies=" + copies +
                ", genre=" + genre +
                ", author=" + author ;
    }
}
