package com.frank;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("A", 10),
                new Movie("B", 15),
                new Movie("C", 20)
        );

        List<Movie> movieList = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toList());
        System.out.println(movieList);

        Set<Movie> movieSet = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toSet());
        System.out.println(movieSet);

        Map<String, Movie> movieMap = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(movieMap);

        int totalLikes = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.summingInt(Movie::getLikes));
        System.out.println(totalLikes);

        IntSummaryStatistics summaryStatistics = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(summaryStatistics);

        String movieNames = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(movieNames);
    }
}
