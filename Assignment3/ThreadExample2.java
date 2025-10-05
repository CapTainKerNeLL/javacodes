package Assignment3;

class ReverseStringRunnable implements Runnable {
    private String text;

    public ReverseStringRunnable(String text) {
        this.text = text;
    }

    public void run() {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(200); // small delay for visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread t = new Thread(new ReverseStringRunnable("MULTITHREADING"));
        t.start();
    }
}
