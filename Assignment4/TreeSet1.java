package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(30);
        System.out.println("TreeSet: " + set);

        System.out.println("Smallest: " + set.first());
        System.out.println("Largest: " + set.last());
        
        set.remove(20);
        System.out.println("After Removing 20: " + set);
    }
}

