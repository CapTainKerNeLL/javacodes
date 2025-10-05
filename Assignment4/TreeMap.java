package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");

        System.out.println("TreeMap (Sorted by Keys): " + map);
    }
}

