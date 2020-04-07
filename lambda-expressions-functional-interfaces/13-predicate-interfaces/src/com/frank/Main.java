package com.frank;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Predicate<String> isMoreThan5 = str -> str.length() > 5;
        IntPredicate isOddNumber = number -> number % 2 == 0;
        LongPredicate isLessThan10 = number -> number < 10;
        DoublePredicate isPI = pi -> pi == 3.14;

        BiPredicate<Character, Integer> isASCII = (c, code) -> (int) c == code;

        System.out.println(isMoreThan5.test("Frank"));
        System.out.println(isOddNumber.test(5));
        System.out.println(isLessThan10.test(20));
        System.out.println(isPI.test(3.14));

        System.out.println(isASCII.test('a', 97));
    }
}
