package Assignment4;

import java.util.*;

public class MergePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Arrays.asList(1, 4, 7));
        PriorityQueue<Integer> q2 = new PriorityQueue<>(Arrays.asList(2, 5, 8));

        PriorityQueue<Integer> merged = new PriorityQueue<>(q1);
        merged.addAll(q2);

        System.out.println("Merged PriorityQueue: " + merged);
    }
}

