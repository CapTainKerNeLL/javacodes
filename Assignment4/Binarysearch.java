package Assignment4;

import java.util.*;

public class BinarySearchDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int index = Collections.binarySearch(list, 5);
        System.out.println("Element 5 found at index: " + index);
    }
}

