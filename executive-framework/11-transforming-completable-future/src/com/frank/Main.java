package com.frank;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 20);
        future
            .thenApply(Main::toFahrenheit)
            .thenRun(System.out::println);
    }

    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }
}
