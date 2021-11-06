package team1.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team1.dao.AuthorDAO;
import team1.entity.Author;
import team1.service.AuthorService;

import java.util.List;

@Service("authorService")
public class AuthorServiceImp implements AuthorService {

    @Autowired
    AuthorDAO authorDao;

    @Override
    public Author add(Author author) {
        return authorDao.add(author);
    }

    @Override
    public void delete(long id) {
        authorDao.delete(id);
    }

    @Override
    public Author update(Author author) {
        return authorDao.update(author);
    }

    @Override
    public Author getById(long id) {
        return authorDao.getById(id);
    }

    @Override
    public List<Author> getAll() {
        return authorDao.getAll();
    }

}
