package com.olasubomi.omaapi.Services;

import com.olasubomi.omaapi.Model.Movie;
import com.olasubomi.omaapi.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
