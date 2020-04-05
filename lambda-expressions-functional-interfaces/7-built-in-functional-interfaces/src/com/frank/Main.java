package com.frank;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Consumer<String> consumer = message -> System.out.println(message);

        Supplier<Integer> supplier = () -> 10;

        Function<String, Integer> function = stringNumber -> Integer.parseInt(stringNumber);

        Predicate<Integer> predicate = oddNumber -> oddNumber % 2 == 0;
    }
}
