package Assignment3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SafeTask implements Runnable {
    private Lock lock1;
    private Lock lock2;

    public SafeTask(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        try {
            while (true) {
                if (lock1.tryLock(500, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println(threadName + " acquired lock1");
                        if (lock2.tryLock(500, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println(threadName + " acquired lock2");
                                System.out.println(threadName + " completed work safely!");
                                break; // done
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
                System.out.println(threadName + " retrying to acquire locks...");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class DeadlockFixed {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(new SafeTask(lock1, lock2), "Thread-1");
        Thread t2 = new Thread(new SafeTask(lock2, lock1), "Thread-2");

        t1.start();
        t2.start();
    }
}

