package com.web.club3.util;

import com.web.club3.model.Author;
import com.web.club3.service.impl.AuthorServiceImpl;
import org.springframework.core.convert.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("authorConverter")
public class AuthorConverter implements Converter<String, Author> {

    private final AuthorServiceImpl authorService;

    @Autowired
    public AuthorConverter(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    @Override
    public Author convert(String source) {
        return authorService.findAuthorById(Integer.parseInt(source));
    }
}
