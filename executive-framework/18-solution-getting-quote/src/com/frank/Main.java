package com.frank;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        FlightService service = new FlightService();
        service.getQuote("site1")
                .thenAccept(System.out::println);

        Thread.sleep(5000);
    }
}
