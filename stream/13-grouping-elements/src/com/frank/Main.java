package com.frank;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("A", 10, Genre.THRILLER),
                new Movie("B", 15, Genre.ACTION),
                new Movie("C", 20, Genre.ACTION)
        );

        Map<Genre, List<Movie>> moviesGroupByGenre = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(moviesGroupByGenre);

        Map<Genre, Map<String, Movie>> moviesGroupByGenreMap = movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.toMap(Movie::getTitle, Function.identity()))
                );
        System.out.println(moviesGroupByGenreMap);

        Map<Genre, Long> moviesCountByGenre = movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.counting())
                );
        System.out.println(moviesCountByGenre);

        Map<Genre, String> movieTiles = movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.mapping(
                                Movie::getTitle,
                                Collectors.joining(", "))
                        )
                );
        System.out.println(movieTiles);
    }
}
