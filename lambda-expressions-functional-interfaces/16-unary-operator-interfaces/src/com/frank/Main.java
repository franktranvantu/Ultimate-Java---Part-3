package com.frank;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        UnaryOperator<Integer> increment = number -> number + 1;
        UnaryOperator<Integer> square = number -> number * number;

        IntUnaryOperator decrement = number -> number - 1;
        LongUnaryOperator mulWith10 = number -> number * 10;
        DoubleUnaryOperator divBy5 = number -> number / 5;

        System.out.println(increment.andThen(square).apply(1));

        System.out.println(decrement.applyAsInt(2));
        System.out.println(mulWith10.applyAsLong(5));
        System.out.println(divBy5.applyAsDouble(1));
    }
}
