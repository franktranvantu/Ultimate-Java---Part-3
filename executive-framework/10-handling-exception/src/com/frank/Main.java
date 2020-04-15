package com.frank;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int age = 50;
            System.out.println("Frank");
            if (age > 30)
                throw new IllegalStateException();
            return age;
        });

        int age = future.exceptionally(ex -> 27).get();
        System.out.println(age);
    }
}
