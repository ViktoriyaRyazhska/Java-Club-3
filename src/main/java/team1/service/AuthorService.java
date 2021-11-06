package team1.service;

import org.springframework.stereotype.Service;
import team1.entity.Author;

import java.util.List;

@Service
public interface AuthorService {
    Author add(Author author);

    void delete(long id);

    Author update(Author t);

    Author getById(long id);

    List<Author> getAll();

}
