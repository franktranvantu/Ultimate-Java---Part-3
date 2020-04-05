package com.frank;

import java.util.function.*;

public class Main {

    private static final Student FRANK = new Student(28, "Frank");

    public static void main(String[] args) {
        Supplier<Student> supplier = () -> FRANK;
        IntSupplier intSupplier = () -> 10;
        LongSupplier longSupplier = () -> 20L;
        DoubleSupplier doubleSupplier = () -> 4.5;
        BooleanSupplier booleanSupplier = () -> true;

        Student frank = supplier.get();
        int intValue = intSupplier.getAsInt();
        long longValue = longSupplier.getAsLong();
        double doubleValue = doubleSupplier.getAsDouble();
        boolean booleanValue = booleanSupplier.getAsBoolean();

        System.out.println(frank);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
    }
}
