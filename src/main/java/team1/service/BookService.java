package team1.service;


import org.springframework.stereotype.Service;
import team1.entity.Book;

import java.util.List;

@Service
public interface BookService {
    Book add(Book book);

    void delete(long id);

    Book update(Book t);

    Book getById(long id);

    List<Book> getAll();
}
