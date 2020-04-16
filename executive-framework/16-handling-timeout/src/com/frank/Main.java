package com.frank;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 10;
        });

        future
            .completeOnTimeout(10, 1, TimeUnit.SECONDS)
            .thenAccept(System.out::print);
    }
}
