package com.frank;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        FlightService service = new FlightService();
        LocalTime start = LocalTime.now();

        List<CompletableFuture<Void>> futures = service.getQuotesAsync()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    LocalTime end = LocalTime.now();
                    Duration duration = Duration.between(start, end);
                    System.out.println("Retrieved all quotes in " + duration.toMillis());
                });

        Thread.sleep(5000);
    }
}
