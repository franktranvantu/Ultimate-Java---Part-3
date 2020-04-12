package com.frank;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
        thread.join();
        System.out.println("File is ready to be scanned");
    }
}
