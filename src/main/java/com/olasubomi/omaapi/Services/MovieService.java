package com.olasubomi.omaapi.Services;

import com.olasubomi.omaapi.Model.Movie;
import com.olasubomi.omaapi.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements IMovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(ObjectId id) {
        return movieRepository.findById(id);
    }

    @Override
    public Optional<Movie> getMovieByImdbId(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }


}
