package Assignment4;

import java.util.*;

public class UnmodifiableListDemo {
    public static void main(String[] args) {
        List<String> original = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> unmodifiable = Collections.unmodifiableList(original);

        System.out.println("Original: " + original);
        System.out.println("Unmodifiable: " + unmodifiable);

        try {
            unmodifiable.add("D");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: Cannot modify unmodifiable list!");
        }
    }
}

