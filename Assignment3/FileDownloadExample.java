package Assignment3;

class FileDownloader extends Thread {
    private volatile boolean running = true;

    public void run() {
        int chunk = 1;
        while (running) {
            System.out.println("Downloading chunk " + chunk++);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
        System.out.println("Download stopped gracefully.");
    }

    public void stopDownload() {
        running = false;
    }
}

public class FileDownloadExample {
    public static void main(String[] args) {
        FileDownloader downloader = new FileDownloader();
        downloader.start();

        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {}

        System.out.println("Requesting stop...");
        downloader.stopDownload();
    }
}

