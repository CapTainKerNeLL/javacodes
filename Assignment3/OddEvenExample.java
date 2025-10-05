package Assignment3;

class OddEvenPrinter {
    private int number = 1;
    private final int MAX = 20;
    private boolean oddTurn = true; 

    public synchronized void printOdd() {
        while (number <= MAX) {
            while (!oddTurn) {
                try { wait(); } catch (InterruptedException e) {}
            }
            System.out.println("Odd Thread: " + number);
            number++;
            oddTurn = false;
            notify();
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            while (oddTurn) {
                try { wait(); } catch (InterruptedException e) {}
            }
            System.out.println("Even Thread: " + number);
            number++;
            oddTurn = true;
            notify();
        }
    }
}

class OddThread extends Thread {
    private OddEvenPrinter printer;
    public OddThread(OddEvenPrinter printer) { this.printer = printer; }
    public void run() { printer.printOdd(); }
}

class EvenThread extends Thread {
    private OddEvenPrinter printer;
    public EvenThread(OddEvenPrinter printer) { this.printer = printer; }
    public void run() { printer.printEven(); }
}

public class OddEvenExample {
    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();
        new OddThread(printer).start();
        new EvenThread(printer).start();
    }
}

