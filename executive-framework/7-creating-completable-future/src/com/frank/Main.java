package com.frank;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture.runAsync(() -> System.out.println("Frank"));

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10);
        int result = future.get();
        System.out.println(result);
    }
}
