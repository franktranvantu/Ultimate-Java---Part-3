package com.frank;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // count()
        // anyMatch(predicate)
        // allMatch(predicate)
        // noneMatch(predicate)
        // findFirst()
        // findAny()
        // max(comparator)
        // min(comparator)

        List<Movie> movies = List.of(
                new Movie("A", 10),
                new Movie("B", 15),
                new Movie("C", 20)
        );

        long count = movies.stream()
              .count();
        System.out.println(count);

        boolean anyLikeGreaterThan50 = movies.stream()
              .anyMatch(movie -> movie.getLikes() > 50);
        System.out.println(anyLikeGreaterThan50);

        boolean allLikesLessThan50 = movies.stream()
              .allMatch(movie -> movie.getLikes() < 50);
        System.out.println(allLikesLessThan50);

        boolean noneMovieGreaterThan50Likes = movies.stream()
              .noneMatch(movie -> movie.getLikes() > 50);
        System.out.println(noneMovieGreaterThan50Likes);

        Movie firstMovie = movies.stream()
              .findFirst()
              .orElse(null);
        System.out.println(firstMovie);

        Movie anyMovie = movies.stream()
              .findAny()
              .orElse(null);
        System.out.println(anyMovie);

        Movie mostLike = movies.stream()
              .max(Comparator.comparing(Movie::getLikes))
              .orElse(null);
        System.out.println(mostLike);

        Movie leastLike = movies.stream()
              .min(Comparator.comparing(Movie::getLikes))
              .orElse(null);
        System.out.println(leastLike);
    }
}
