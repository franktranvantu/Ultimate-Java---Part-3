package com.frank;

public class Main {

    public static void main(String[] args) {
        new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        }.print("Hello World");
    }
}
