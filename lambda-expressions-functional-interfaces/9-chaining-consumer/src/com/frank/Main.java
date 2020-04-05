package com.frank;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3);
        Consumer<Integer> print = item -> System.out.println(item);
        Consumer<Integer> printSquare = item -> System.out.println(item * item);
        list.forEach(print.andThen(printSquare).andThen(print).andThen(item -> System.out.println()));
    }
}
