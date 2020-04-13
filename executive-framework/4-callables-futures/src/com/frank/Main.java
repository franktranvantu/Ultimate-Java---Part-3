package com.frank;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(() -> {
            LongTask.simulate();
            return 10;
        });

        System.out.println("Do more work");
        int result = future.get();
        System.out.println(result);

        executorService.shutdown();
    }
}
