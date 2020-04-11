package com.frank;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
        int currentPage = 8;
        int pageSize = 10;
        AtomicInteger likes = new AtomicInteger();
        List<Movie> movies = Stream.generate(() -> {
            likes.getAndIncrement();
            return new Movie(String.valueOf(likes.get()), likes.get());
        })
        .limit(100)
        .collect(Collectors.toList());

        movies.stream()
            .skip((currentPage - 1) * pageSize)
            .limit(pageSize)
            .forEach(System.out::println);

        movies.stream()
            .takeWhile(movie -> movie.getLikes() < 50)
            .dropWhile(movie -> movie.getLikes() < 30)
            .forEach(System.out::println);
    }
}
