package team1.dao;

import team1.entity.Book;

import java.util.List;

public interface BookDAO {
    Book add(Book book);

    void delete(long id);

    Book update(Book book);

    Book getById(Integer id);

    List<Book> getAll();
}
