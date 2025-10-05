package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();

        scores.put("John", 88);
        scores.put("Alice", 95);
        scores.put("Bob", 76);
        scores.put("David", 90);

        System.out.println("TreeMap Sorted by Keys: " + scores);
    }
}

