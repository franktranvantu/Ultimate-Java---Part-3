package com.frank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Thread thread1 = new Thread(() -> list.addAll(Arrays.asList(1, 2, 3)));
        Thread thread2 = new Thread(() -> list.addAll(Arrays.asList(4, 5, 6)));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(list);
    }
}
