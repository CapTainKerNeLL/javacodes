package Assignment3;

class AutoSaveDaemon extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Auto-Save in progress...");
                Thread.sleep(3000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadExample6 {
    public static void main(String[] args) {
        AutoSaveDaemon daemon = new AutoSaveDaemon();
        daemon.setDaemon(true); 
        daemon.start();

        
        System.out.println("File processing started...");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing file chunk " + i);
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File processing completed!");

    
    }
}

