package Assignment3;

class Thread1 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 1");
                Thread.sleep(1000); // 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 2");
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadExample3 {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}

