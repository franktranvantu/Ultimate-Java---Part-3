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
              .limit(2)
              .forEach(System.out::println);

        movies.stream()
              .skip(2)
              .forEach(System.out::println);

        movies.stream()
              .takeWhile(movie -> movie.getLikes() < 20)
              .forEach(System.out::println);

        movies.stream()
              .dropWhile(movie -> movie.getLikes() < 20)
              .forEach(System.out::println);
    }
}
