package com.frank;

public class Main {

    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();

        Thread thread1 = new Thread(new DownloadFileTask(status));
        Thread thread2 = new Thread(() -> {
           while (!status.isDone()) {
               synchronized (status) {
                   try {
                       status.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
           int totalBytes = status.getTotalBytes();
           System.out.println(totalBytes);
        });

        thread1.start();
        thread2.start();

    }
}
