package Assignment4;

import java.util.*;

class TicketBookingSystem {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("Ticket Booking Queue: " + queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll() + " has booked a ticket.");
        }
    }
}

