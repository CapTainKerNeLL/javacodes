package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("After Adding: " + names);

        names.remove("Bob");
        System.out.println("After Removing 'Bob': " + names);

        names.remove(1);
        System.out.println("After Removing Index 1: " + names);

        names.add("David"); 
        names.add("Eve");
        names.set(1, "Brian");
        System.out.println("After Replacing Index 1 with 'Brian': " + names);
    }
}
