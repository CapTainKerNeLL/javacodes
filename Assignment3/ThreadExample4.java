package Assignment3;

class CountdownThread extends Thread {
    public void run() {
        try {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Countdown: " + i);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TickThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("Tick...");
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadExample4 {
    public static void main(String[] args) {
        new CountdownThread().start();
        new TickThread().start();
    }
}

