package frank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        Stream<Thread> stream = Stream.generate(() -> {
            DownloadFileTask task = new DownloadFileTask();
            tasks.add(task);
            return new Thread(task);
        }).limit(10);

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

        int totalBytes = tasks.stream()
             .mapToInt(task -> task.getStatus().getTotalBytes())
             .sum();
        System.out.println(totalBytes);
    }
}
