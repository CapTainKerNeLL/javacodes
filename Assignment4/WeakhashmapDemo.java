package Assignment4;

import java.util.*;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        Map<Object, String> map = new WeakHashMap<>();
        Object key = new Object();
        map.put(key, "Value");

        System.out.println("Before GC: " + map);
        key = null;
        System.gc();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("After GC: " + map);
    }
}

