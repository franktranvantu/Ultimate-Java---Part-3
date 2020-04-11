package com.frank;

import java.util.List;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("A", 10),
                new Movie("B", 15),
                new Movie("C", 20)
        );

        OptionalInt numberOfLikes = movies.stream()
              .mapToInt(Movie::getLikes)
              .reduce(Integer::sum);
        System.out.println(numberOfLikes.orElse(0));

        int sumOfLikes = movies.stream()
              .mapToInt(Movie::getLikes)
              .reduce(0, Integer::sum);
        System.out.println(sumOfLikes);
    }
}
