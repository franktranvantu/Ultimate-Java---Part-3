package frank;

import java.util.stream.IntStream;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());
        IntStream.rangeClosed(1, 10_000)
                 .forEach(i -> status.incrementTotalBytes());
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
