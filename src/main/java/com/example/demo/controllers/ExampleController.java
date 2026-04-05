package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ExampleController {
    @GetMapping("/futuro")
    public String getFuturo() {
        return "En 5 años me veo como una ingeniera de sistemas exitosa, con un trabajo estable en el estranjero pero viviendo aqui en bolivia estudiando otra carrera.";
    }

    @GetMapping("/peliculas")
    public List<Map<String,Object>> getPeliculas(
            @RequestParam(defaultValue = "accion") String genero) {
        List<Map<String, Object>> peliculas = new ArrayList<>();

        peliculas.add(createMovie("Inception", "Accion", 2010, "Christopher Nolan", 9.0));
        peliculas.add(createMovie("Titanic", "Romance", 1997, "James Cameron", 8.5));
        peliculas.add(createMovie("Avergers", "Accion", 2012, "Marvel", 9.2));
        peliculas.add(createMovie("Interstellar", "Ciencia ficcion", 2014, "Christopher Nolan", 9.5));
        peliculas.add(createMovie("Joker", "Drama", 2019, "Todd Phillips", 8.8));
        peliculas.add(createMovie("Frozen", "Animacion", 2013, "Disney", 8.0));
        peliculas.add(createMovie("Matrix", "Accion", 1999, "Wachowski", 9.3));
        peliculas.add(createMovie("Gladiador", "Historico", 2000, "Ridley Scott", 9.1));
        peliculas.add(createMovie("Avatar", "Ciencia ficcion", 2009, "James Cameron", 8.9));
        peliculas.add(createMovie("Spider-Man", "Accion", 2021, "Marvel", 9.0));
        peliculas.add(createMovie("Harry Potter y el prisionero de Azkaban", "Fantasia/Aventura", 2004, "Alfonso Cuaron", 7.9));
        peliculas.add(createMovie("Toy Story 1", "Animacion", 1995, "John Lasseter", 8.3));

        return peliculas;
    }

    private Map<String, Object> createMovie(String nombre, String genero, int año, String director, double rating){
        Map<String, Object> movie = new HashMap<>();
        movie.put("nombre", nombre);
        movie.put("genero", genero);
        movie.put("año", año);
        movie.put("director", director);
        movie.put("rating", rating);

        return movie;

    }
}
