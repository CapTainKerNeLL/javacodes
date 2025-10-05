package Assignment3;

class Chopstick {}

class Philosopher extends Thread {
    private Chopstick left;
    private Chopstick right;

    public Philosopher(String name, Chopstick left, Chopstick right) {
        super(name);
        this.left = left;
        this.right = right;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(getName() + " is thinking...");
                Thread.sleep(1000);

                synchronized (left) {
                    System.out.println(getName() + " picked up left chopstick.");
                    Thread.sleep(500);

                    synchronized (right) {
                        System.out.println(getName() + " picked up right chopstick.");
                        System.out.println(getName() + " is eating...");
                        Thread.sleep(1000);
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class DiningPhilosophersDeadlock {
    public static void main(String[] args) {
        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();

        Philosopher p1 = new Philosopher("Philosopher-1", c1, c2);
        Philosopher p2 = new Philosopher("Philosopher-2", c2, c1); 

        p1.start();
        p2.start();
    }
}

