package Assignment4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int operations = 10000;

        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) arrayList.add(0, i);
        long end = System.nanoTime();
        System.out.println("ArrayList Add at Beginning: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < operations; i++) linkedList.add(0, i);
        end = System.nanoTime();
        System.out.println("LinkedList Add at Beginning: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < operations / 2; i++) arrayList.remove(arrayList.size() / 2);
        end = System.nanoTime();
        System.out.println("ArrayList Remove Middle: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < operations / 2; i++) linkedList.remove(linkedList.size() / 2);
        end = System.nanoTime();
        System.out.println("LinkedList Remove Middle: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int n : arrayList) {}
        end = System.nanoTime();
        System.out.println("ArrayList Iteration: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int n : linkedList) {}
        end = System.nanoTime();
        System.out.println("LinkedList Iteration: " + (end - start) + " ns");
    }
}

