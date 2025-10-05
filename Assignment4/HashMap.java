package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        int searchKey = 102;
        System.out.println("Contains Key " + searchKey + "? " + employees.containsKey(searchKey));

        System.out.println("\nIterating using KeySet:");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " -> " + employees.get(id));
        }

        System.out.println("\nIterating using EntrySet:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

