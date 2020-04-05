package com.frank;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // key:value
        // first: key=value
        // second: {key=value}
        String keyValue = "key:value";
        Function<String, String> replace = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
        String result = replace.andThen(addBraces).apply(keyValue);
        System.out.println(result);
        result = addBraces.compose(replace).apply(keyValue);
        System.out.println(result);
    }
}
