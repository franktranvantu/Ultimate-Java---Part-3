package frank;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        System.out.println("File is ready to be scanned");
    }
}
