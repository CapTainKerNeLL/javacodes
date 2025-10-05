package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(2, "B");

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "C");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");

        System.out.println("HashMap (No Order Guaranteed): " + hashMap);
        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);
    }
}

