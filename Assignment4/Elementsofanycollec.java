package Assignment4;

import java.util.*;

class Main {
    public static <T> void printCollection(Collection<T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Mango");
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Queue<Double> queue = new LinkedList<>(Arrays.asList(1.1, 2.2, 3.3));

        System.out.println("List Elements:");
        printCollection(list);

        System.out.println("\nSet Elements:");
        printCollection(set);

        System.out.println("\nQueue Elements:");
        printCollection(queue);
    }
}
