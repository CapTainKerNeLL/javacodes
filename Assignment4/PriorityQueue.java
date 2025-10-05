package Assignment4;

import java.util.*;

class TaskManager {
    public static void main(String[] args) {
        PriorityQueue<String> tasks = new PriorityQueue<>();

        tasks.add("Low Priority Task");
        tasks.add("High Priority Task");
        tasks.add("Medium Priority Task");

        System.out.println("Tasks in Priority Queue: " + tasks);

        System.out.println("Removing Highest Priority Task: " + tasks.poll());
        System.out.println("Remaining Tasks: " + tasks);
    }
}

