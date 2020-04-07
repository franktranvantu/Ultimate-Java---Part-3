package com.frank;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        BinaryOperator<Integer> add = (x1, x2) -> x1 + x2;
        IntBinaryOperator add2 = (x1, x2) -> x1 + x2;
        LongBinaryOperator mul = (x1, x2) -> x1 * x2;
        DoubleBinaryOperator sub = (x1, x2) -> x1 - x2;

        Function<Integer, Integer> square = number -> number * number;

        System.out.println(add.apply(1, 2));
        System.out.println(add2.applyAsInt(1, 2));
        System.out.println(mul.applyAsLong(10L, 20L));
        System.out.println(sub.applyAsDouble(1.5, 6.0));

        System.out.println(add.andThen(square).apply(1, 2));
    }
}
