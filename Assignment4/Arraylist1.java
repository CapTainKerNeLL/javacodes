package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Charlie", "Alice", "Bob"));

        Collections.sort(names);
        System.out.println("Sorted Alphabetically: " + names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Sorted Reverse Alphabetically: " + names);
    }
}

