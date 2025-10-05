package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("ArrayList Elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
