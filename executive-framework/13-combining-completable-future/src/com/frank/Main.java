package com.frank;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<Integer> first = CompletableFuture
            .supplyAsync(() -> "20USD")
            .thenApply(str -> {
                String price = str.replace("USD", "");
                return Integer.parseInt(price);
            });
        CompletableFuture<Double> second = CompletableFuture.supplyAsync(() -> 0.9);
        first
            .thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
            .thenAccept(System.out::println);
    }
}
