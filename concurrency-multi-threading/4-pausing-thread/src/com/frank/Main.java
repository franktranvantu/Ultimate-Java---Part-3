package com.frank;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream.generate(() -> new Thread(new DownloadFileTask()))
              .limit(10)
              .forEach(Thread::start);
    }
}
