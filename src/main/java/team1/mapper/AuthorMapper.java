package team1.mapper;

import org.springframework.stereotype.Component;
import team1.dto.AuthorCreateDto;
import team1.dto.AuthorDto;
import team1.entity.Author;

@Component
public class AuthorMapper {
    public static Author dtoToAuthor(AuthorCreateDto authorCreateDto) {
        Author author = new Author();
        author.setName(authorCreateDto.getName());
        author.setSurname(authorCreateDto.getSurname());
        return author;
    }

    public static AuthorDto authorToDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setName(author.getName());
        authorDto.setSurname(author.getSurname());
        return authorDto;
    }
}
