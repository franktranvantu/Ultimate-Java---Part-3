package com.frank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();

        Stream<Thread> stream = Stream.generate(() -> new Thread(new DownloadFileTask(status)))
              .limit(10);

        stream.forEach(thread -> {
              thread.start();
              threads.add(thread);
        });

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        int totalBytes = status.getTotalBytes();
        System.out.println(totalBytes);
    }
}
