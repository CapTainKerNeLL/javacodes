package Assignment4;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        Runnable writer = () -> list.add("C");
        Runnable reader = () -> {
            for (String s : list) {
                System.out.println(Thread.currentThread().getName() + " reads: " + s);
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final list: " + list);
    }
}





