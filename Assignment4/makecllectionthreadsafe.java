package Assignment4;

import java.util.*;

public class SynchronizedCollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> syncList = Collections.synchronizedList(list);

        syncList.add("A");
        syncList.add("B");

        synchronized (syncList) {
            for (String s : syncList) {
                System.out.println(s);
            }
        }
    }
}

