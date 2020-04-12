package com.frank;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        IntStream.range(1, 5).forEach(System.out::println);
        IntStream.rangeClosed(1, 5).forEach(System.out::println);

        Random random = new Random();
        LongStream.generate(() -> random.nextLong())
                .limit(3)
                .forEach(System.out::println);

        DoubleStream.of(1.5, 2.3, 6, 8.0)
                .filter(d -> d > 3.5)
                .forEach(System.out::println);
    }
}
