package com.web.club3.service.impl;

import com.web.club3.dao.impl.GenreDAOImpl;
import com.web.club3.dto.GenreDto;
import com.web.club3.model.Genre;
import com.web.club3.service.CRUDService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class GenreServiceImpl implements CRUDService<GenreDto> {

    private final GenreDAOImpl genreDAO;
    private final ModelMapper modelMapper;

    @Autowired
    public GenreServiceImpl(GenreDAOImpl genreDAO, ModelMapper modelMapper) {
        this.genreDAO = genreDAO;
        this.modelMapper = modelMapper;
    }

    @Override
    public GenreDto findById(int id) {
        Genre genre = genreDAO.findById(id);
        return modelMapper.map(genre, GenreDto.class);
    }

    @Override
    public List<GenreDto> findAll() {
        List<Genre> genres = genreDAO.findAll();
        return genres.stream().map(g -> modelMapper.map(g, GenreDto.class)).collect(toList());
    }

    @Override
    public GenreDto create(GenreDto genreDto) {
        Genre genre = modelMapper.map(genreDto, Genre.class);
        return modelMapper.map(genreDAO.create(genre), GenreDto.class);
    }

    @Override
    public GenreDto update(GenreDto genreDto) {
        Genre genre = modelMapper.map(genreDto, Genre.class);
        return modelMapper.map(genreDAO.update(genre), GenreDto.class);
    }

    @Override
    public void deleteById(int id) {
        genreDAO.deleteById(id);
    }
}
