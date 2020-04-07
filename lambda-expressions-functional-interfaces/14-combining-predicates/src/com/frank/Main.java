package com.frank;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
        System.out.println(hasLeftAndRightBraces.test("{key:value}"));

        Predicate<String> hasNotLeftBrace = hasLeftBrace.negate();
        System.out.println(hasNotLeftBrace.test("key"));
    }
}
