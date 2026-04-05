package com.example.demo.services;

import com.example.demo.dto.v1.MovieDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MovieService {
    private final List<MovieDTO> movies = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public MovieService() {

        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Inception", "Christopher Nolan", 2010));
        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Titanic", "James Cameron", 1997));
        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Avengers", "Marvel", 2012));
        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Interstellar", "Christopher Nolan", 2014));
        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Joker", "Todd Phillips", 2019));
        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Frozen", "Disney", 2013));
        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Matrix", "Wachowski", 1999));
        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Gladiador", "Ridley Scott", 2000));
        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Avatar", "James Cameron", 2009));
        movies.add(new MovieDTO(idGenerator.getAndIncrement(), "Spider-Man", "Marvel", 2021));
    }

    public List<MovieDTO> getAllMovies() {
        return movies;
    }

    public MovieDTO addMovie(MovieDTO movie) {
        movie.setId(idGenerator.getAndIncrement());
        movies.add(movie);
        return movie;
    }
}

