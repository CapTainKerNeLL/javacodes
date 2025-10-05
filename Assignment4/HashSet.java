package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); 

        System.out.println("HashSet after adding duplicates: " + set);
    }
}

