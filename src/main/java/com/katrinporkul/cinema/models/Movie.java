package com.katrinporkul.cinema.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies_details")
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private long movieId;

    @Column(nullable = false)
    private String movieName;

    @Column(nullable = false)
    private String image;

    @Column(columnDefinition = "varchar(1000) ", nullable = false)
    private String movieDetails;

    @Override
    public String toString() {
        return "MovieDetails [movieId=" + movieId + ", movieName=" + movieName + ", image=" + image + ", movieDetails="
                + movieDetails + "]";
    }
}
