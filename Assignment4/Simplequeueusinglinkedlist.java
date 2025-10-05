package Assignment4;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue after insertion: " + queue);

        int removed = queue.poll();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after removal: " + queue);

        System.out.println("Front element: " + queue.peek());
    }
}

