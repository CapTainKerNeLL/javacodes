package Assignment3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockTask implements Runnable {
    private Lock lock1;
    private Lock lock2;

    public DeadlockTask(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        try {
            lock1.lock();
            System.out.println(threadName + " acquired lock1");

            Thread.sleep(100); 

            lock2.lock();
            System.out.println(threadName + " acquired lock2");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock1.unlock();
            lock2.unlock();
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(new DeadlockTask(lock1, lock2), "Thread-1");
        Thread t2 = new Thread(new DeadlockTask(lock2, lock1), "Thread-2");

        t1.start();
        t2.start();
    }
}

