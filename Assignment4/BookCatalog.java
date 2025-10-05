package Assignment4;

import java.util.*;

public class BookCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new HashMap<>();
        catalog.put("Atomic Habits", "James Clear");
        catalog.put("1984", "George Orwell");

        String title = "1984";
        System.out.println("Author of '" + title + "': " + catalog.get(title));
    }
}

