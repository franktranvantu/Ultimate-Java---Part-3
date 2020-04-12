package frank;

public class DownloadStatus {

    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public void incrementTotalFiles() {
        synchronized (totalFilesLock) {
            totalFiles++;
        }
    }
}
