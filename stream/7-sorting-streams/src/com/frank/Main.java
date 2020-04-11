package com.frank;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("B", 10),
            new Movie("A", 15),
            new Movie("C", 20)
        );

        movies.stream()
              .sorted(((o1, o2) -> o1.getTitle().compareTo(o2.getTitle())))
              .sorted(Comparator.comparing(movie -> movie.getTitle()))
              .sorted(Comparator.comparing(Movie::getTitle))
              .sorted(Comparator.comparing(Movie::getTitle).reversed())
              .forEach(System.out::println);
    }
}
