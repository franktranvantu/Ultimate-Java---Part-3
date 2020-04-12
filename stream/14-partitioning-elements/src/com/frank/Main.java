package com.frank;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("A", 10, Genre.THRILLER),
                new Movie("B", 15, Genre.ACTION),
                new Movie("C", 20, Genre.ACTION)
        );

        Map<Boolean, String> result = movies.stream()
              .collect(Collectors.partitioningBy(
                      movie -> movie.getLikes() > 15,
                      Collectors.mapping(
                              Movie::getTitle,
                              Collectors.joining(", ")
                      ))
              );
        System.out.println(result);
    }
}
