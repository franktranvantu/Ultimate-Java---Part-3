package com.frank;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightService {

    public Stream<CompletableFuture<Quote>> getQuotesAsync() {
        List<String> sites = Arrays.asList("site1", "site2", "site3");

        return sites.stream()
                .map(this::getQuoteAsync);
    }

    public CompletableFuture<Quote> getQuoteAsync(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from " + site);
            Random random = new Random();
            LongTask.simulate(1_000 + random.nextInt(2_000));
            int price = 100 + random.nextInt(10);
            return new Quote(site, price);
        });
    }

    public List<Quote> getQuotes() {
        List<String> sites = Arrays.asList("site1", "site2", "site3");

        return sites.stream()
                .map(this::getQuote)
                .collect(Collectors.toList());
    }

    public Quote getQuote(String site) {
        System.out.println("Getting a quote from " + site);
        LongTask.simulate();
        Random random = new Random();
        int price = 100 + random.nextInt(10);
        return new Quote(site, price);
    }
}
