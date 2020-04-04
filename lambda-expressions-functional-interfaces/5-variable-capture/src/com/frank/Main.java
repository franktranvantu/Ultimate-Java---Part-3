package com.frank;

public class Main {

    public static void main(String[] args) {
        String prefix = "-";
        Printer printer = message -> System.out.println(prefix + message);
        printer.print("Hello World");
    }
}
