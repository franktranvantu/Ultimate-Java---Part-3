package com.frank;

public class Main {

    public Main(String message) {
        if (!"".equals(message))
            System.out.println(message);
    }

    public static void main(String[] args) {
        greeting(System.out::println, "Hello");
        greeting(Main::print, "Hi");
        greeting(new Main("")::print2, "Hey");
        greeting(Main::new, "He");
    }

    public static void greeting(Printer printer, String message) {
        printer.print(message);
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public void print2(String message) {
        System.out.println(message);
    }
}
