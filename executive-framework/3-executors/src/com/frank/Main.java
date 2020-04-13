package com.frank;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        IntStream.rangeClosed(1, 10)
                .forEach((i) -> {
                    try {
                        executorService.submit(() -> System.out.println(Thread.currentThread().getName()));
                    } finally {
                        executorService.shutdown();
                    }
                });
        executorService.shutdown();
    }
}
