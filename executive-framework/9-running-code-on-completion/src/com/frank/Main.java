package com.frank;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10);
//        future.thenRun(() -> System.out.println(Thread.currentThread().getName()));
//        future.thenRunAsync(() -> System.out.println(Thread.currentThread().getName()));

        future.thenAccept(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });
        future.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });

        future.thenApply(result -> {
            System.out.println(Thread.currentThread().getName());
            return result;
        });
        future.thenApplyAsync(result -> {
            System.out.println(Thread.currentThread().getName());
            return result;
        });
    }
}
