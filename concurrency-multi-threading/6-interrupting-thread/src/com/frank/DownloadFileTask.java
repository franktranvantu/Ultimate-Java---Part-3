package com.frank;

import java.util.stream.IntStream;

public class DownloadFileTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());
        IntStream.rangeClosed(1, Integer.MAX_VALUE)
                 .forEach(i -> {
                     if (Thread.currentThread().isInterrupted())
                         return;
                     System.out.println("Downloading byte " + i);
                 });
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
