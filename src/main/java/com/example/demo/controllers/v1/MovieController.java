package com.example.demo.controllers.v1;

import com.example.demo.dto.v1.MovieDTO;
import com.example.demo.services.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // GET
    @GetMapping
    public List<MovieDTO> getMovies() {
        return movieService.getAllMovies();
    }

    // POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieDTO addMovie(@RequestBody MovieDTO movie) {
        return movieService.addMovie(movie);
    }
}
