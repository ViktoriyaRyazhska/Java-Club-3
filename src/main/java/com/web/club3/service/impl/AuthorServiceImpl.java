package com.web.club3.service.impl;

import com.web.club3.dao.impl.AuthorDAOImpl;
import com.web.club3.dto.AuthorDTO;
import com.web.club3.model.Author;
import com.web.club3.service.AuthorService;
import com.web.club3.service.CRUDService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class AuthorServiceImpl implements CRUDService<AuthorDTO>, AuthorService {
    private final AuthorDAOImpl authorDAO;
    private final ModelMapper modelMapper;

    @Autowired
    public AuthorServiceImpl(AuthorDAOImpl authorDAO, ModelMapper modelMapper) {
        this.authorDAO = authorDAO;
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDTO findById(int id) {
        Author author = authorDAO.findById(id);
        return modelMapper.map(author, AuthorDTO.class);
    }

    @Override
    public List<AuthorDTO> findAll() {
        List<Author> authors = authorDAO.findAll();
        return authors.stream().map(a -> modelMapper.map(a, AuthorDTO.class)).collect(Collectors.toList());
    }

    @Override
    public AuthorDTO create(AuthorDTO authorDTO) {
        Author author = modelMapper.map(authorDTO, Author.class);
        return modelMapper.map(authorDAO.create(author), AuthorDTO.class);
    }

    @Override
    public AuthorDTO update(AuthorDTO authorDTO) {
        Author author = modelMapper.map(authorDTO, Author.class);
        return modelMapper.map(authorDAO.update(author), AuthorDTO.class);
    }

    @Override
    public void deleteById(int id) {
        authorDAO.deleteById(id);
    }

    @Override
    public Author findAuthorById(int id) {
        return authorDAO.findById(id);
    }
}
