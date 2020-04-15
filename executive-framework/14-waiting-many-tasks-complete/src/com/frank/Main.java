package com.frank;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<Integer> first = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Boolean> second = CompletableFuture.supplyAsync(() -> true);
        CompletableFuture<String> third = CompletableFuture.supplyAsync(() -> "Frank");

        CompletableFuture<Void> all = CompletableFuture.allOf(first, second, third);
        all.thenRun(() -> {
            try {
                int number = first.get();
                boolean isActive = second.get();
                String name = third.get();
                System.out.println(number);
                System.out.println(isActive);
                System.out.println(name);
                System.out.println("All tasks completed successfully");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
