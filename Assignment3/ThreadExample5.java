package Assignment3;

class WorkerThread extends Thread {
    public WorkerThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running - iteration " + i);
        }
    }
}

public class ThreadExample5 {
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread("Worker-1");
        WorkerThread t2 = new WorkerThread("Worker-2");
        WorkerThread t3 = new WorkerThread("Worker-3");

        t1.setPriority(Thread.MIN_PRIORITY); 
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(Thread.MAX_PRIORITY); 

        t1.start();
        t2.start();
        t3.start();
    }
}

