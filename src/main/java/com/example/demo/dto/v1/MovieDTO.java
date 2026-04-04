package com.example.demo.dto.v1;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Movie object representing a film")
public class MovieDTO {

    @Schema(description = "Movie ID", example = "1")
    private Long id;

    @Schema(description = "Title of the movie", example = "Inception")
    private String title;

    @Schema(description = "Director of the movie", example = "Christopher Nolan")
    private String director;

    @Schema(description = "Release year", example = "2010")
    private int year;

    // Constructors
    public MovieDTO() {}
    public MovieDTO(Long id, String title, String director, int year) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}

