package com.web.club3.service.impl;

import com.web.club3.dao.impl.AuthorDAOImpl;
import com.web.club3.dto.AuthorDto;
import com.web.club3.model.Author;
import com.web.club3.service.CRUDService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class AuthorServiceImpl implements CRUDService<AuthorDto> {
    private final AuthorDAOImpl authorDAO;
    private final ModelMapper modelMapper;

    @Autowired
    public AuthorServiceImpl(AuthorDAOImpl authorDAO, ModelMapper modelMapper) {
        this.authorDAO = authorDAO;
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDto findById(int id) {
        Author author = authorDAO.findById(id);
        return modelMapper.map(author, AuthorDto.class);
    }

    @Override
    public List<AuthorDto> findAll() {
        List<Author> authors = authorDAO.findAll();
        return authors.stream().map(a -> modelMapper.map(a, AuthorDto.class)).collect(toList());
    }

    @Override
    public AuthorDto create(AuthorDto authorDto) {
        Author author = modelMapper.map(authorDto, Author.class);
        return modelMapper.map(authorDAO.create(author), AuthorDto.class);
    }

    @Override
    public AuthorDto update(AuthorDto authorDto) {
        Author author = modelMapper.map(authorDto, Author.class);
        return modelMapper.map(authorDAO.update(author), AuthorDto.class);
    }

    @Override
    public void deleteById(int id) {
        authorDAO.deleteById(id);
    }
}
