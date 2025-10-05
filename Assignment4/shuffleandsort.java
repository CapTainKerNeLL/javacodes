package Assignment4;

import java.util.*;

public class ShuffleSortDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }
}

