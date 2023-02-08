package com.olasubomi.omaapi.Services;

import com.olasubomi.omaapi.Model.Movie;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface IMovieService {
    List<Movie> allMovies();
    Optional<Movie> getMovieById(ObjectId id);
}
