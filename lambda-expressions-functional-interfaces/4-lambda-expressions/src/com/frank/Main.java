package com.frank;

public class Main {

    public static void main(String[] args) {
        Printer printer = message -> System.out.println(message);
        printer.print("Hello World");
    }
}
