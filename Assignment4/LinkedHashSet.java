package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Dog");
        set.add("Cat");
        set.add("Elephant");
        set.add("Lion");

        System.out.println("Iterating over LinkedHashSet:");
        for (String animal : set) {
            System.out.println(animal);
        }

        System.out.println("\nNote: LinkedHashSet preserves insertion order, unlike HashSet.");
    }
}

