package Assignment3;

class TicketBooking {
    private int availableTickets = 5;


    public synchronized void bookTicket(String user, int numberOfTickets) {
        if (numberOfTickets <= availableTickets) {
            System.out.println(user + " successfully booked " + numberOfTickets + " ticket(s).");
            availableTickets -= numberOfTickets;
            System.out.println("Tickets left: " + availableTickets);
        } else {
            System.out.println(user + " failed to book " + numberOfTickets + " ticket(s). Not enough tickets!");
        }
    }
}

class UserThread extends Thread {
    private TicketBooking bookingSystem;
    private String userName;
    private int ticketsToBook;

    public UserThread(TicketBooking bookingSystem, String userName, int ticketsToBook) {
        this.bookingSystem = bookingSystem;
        this.userName = userName;
        this.ticketsToBook = ticketsToBook;
    }

    public void run() {
        bookingSystem.bookTicket(userName, ticketsToBook);
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketBooking bookingSystem = new TicketBooking();

        UserThread u1 = new UserThread(bookingSystem, "User1", 2);
        UserThread u2 = new UserThread(bookingSystem, "User2", 3);
        UserThread u3 = new UserThread(bookingSystem, "User3", 2);

        u1.start();
        u2.start();
        u3.start();
    }
}
