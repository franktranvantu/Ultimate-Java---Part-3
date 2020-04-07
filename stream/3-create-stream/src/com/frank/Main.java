package com.frank;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Collection
//        List<Integer> numbers = List.of(1, 2, 3);
//        numbers.stream()
//                .forEach(number -> System.out.println(number));

        // Array
//        int[] array = {1, 2, 3};
//        Arrays.stream(array)
//                .forEach(number -> System.out.println(number));

//        Stream.of(1, 2, 3).forEach(number -> System.out.println(number));
//        Stream.of(new Point()).forEach(point -> System.out.println(point));

//        Random random = new Random();
//        Stream<Integer> stream = Stream.generate(() -> random.nextInt(100));
//        stream.limit(5).forEach(number -> System.out.println(number));

        Stream.iterate(1, number -> number + 1)
              .limit(10)
              .forEach(number -> System.out.println(number));

    }
}
