package com.frank;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<Integer> first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 10;
        });
        CompletableFuture<Double> second = CompletableFuture.supplyAsync(() -> 20.0);

        CompletableFuture
            .anyOf(first, second)
            .thenAccept(System.out::println);
    }
}
