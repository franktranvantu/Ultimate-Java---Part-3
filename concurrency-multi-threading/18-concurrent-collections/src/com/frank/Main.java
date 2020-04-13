package com.frank;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Frank", 27);
        map.get("Frank");
        map.remove("Frank");
    }
}
