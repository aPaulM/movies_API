package com.example.movies.service;

import com.example.movies.models.Movie;
import com.example.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired // @Autowired is a super busted way of instantiating this repository.
    private MovieRepository movieRepo;

  // CONSTRUCTOR not needed because of @Autowired
  // public MovieService(MovieService movieService) {
  //     this.movieService = movieService;
  // }

    public List<Movie> listAllMovies() {
        return movieRepo.findAll();
    }

    public Optional<Movie> listSingleMovie(String imdbId) {
        return movieRepo.findMovieByImdbId(imdbId);
    }

}
