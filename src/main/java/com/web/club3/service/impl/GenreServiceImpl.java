package com.web.club3.service.impl;

import com.web.club3.dao.impl.GenreDAOImpl;
import com.web.club3.dto.GenreDTO;
import com.web.club3.model.Genre;
import com.web.club3.service.CRUDService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GenreServiceImpl implements CRUDService<GenreDTO> {

    private final GenreDAOImpl genreDAO;
    private final ModelMapper modelMapper;

    @Autowired
    public GenreServiceImpl(GenreDAOImpl genreDAO, ModelMapper modelMapper) {
        this.genreDAO = genreDAO;
        this.modelMapper = modelMapper;
    }

    @Override
    public GenreDTO findById(int id) {
        Genre genre = genreDAO.findById(id);
        return modelMapper.map(genre, GenreDTO.class);
    }

    @Override
    public List<GenreDTO> findAll() {
        List<Genre> genres = genreDAO.findAll();
        return genres.stream().map(g -> modelMapper.map(g, GenreDTO.class)).collect(Collectors.toList());
    }

    @Override
    public GenreDTO create(GenreDTO genreDTO) {
        Genre genre = modelMapper.map(genreDTO, Genre.class);
        return modelMapper.map(genreDAO.create(genre), GenreDTO.class);
    }

    @Override
    public GenreDTO update(GenreDTO genreDTO) {
        Genre genre = modelMapper.map(genreDTO, Genre.class);
        return modelMapper.map(genreDAO.update(genre), GenreDTO.class);
    }

    @Override
    public void deleteById(int id) {
        genreDAO.deleteById(id);
    }
}
