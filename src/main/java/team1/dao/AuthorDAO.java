package team1.dao;

import team1.entity.Author;

import java.util.List;

public interface AuthorDAO{
    Author add(Author author);

    void delete(long id);

    Author update(Author author);

    Author getById(long id);

    List<Author> getAll();
}
