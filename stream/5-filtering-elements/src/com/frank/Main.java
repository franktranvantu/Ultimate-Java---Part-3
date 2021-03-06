package com.frank;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("A", 10),
            new Movie("B", 15),
            new Movie("C", 20)
        );

        movies.stream()
              .filter(movie -> movie.getLikes() > 10)
              .forEach(System.out::println);
    }
}
