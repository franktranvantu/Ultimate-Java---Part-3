package com.frank;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 15),
                new Movie("C", 20)
        );

        movies.stream()
              .filter(movie -> movie.getLikes() > 10)
              .peek(movie -> System.out.println("Filtered: " + movie))
              .mapToInt(Movie::getLikes)
              .peek(like -> System.out.println("Mapped: " + like))
              .forEach(System.out::println);
    }
}
