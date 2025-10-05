package Assignment3;

class Inventory {
    private int stock = 10;

    public void purchase(String customer, int qty) {
        synchronized (this) {  
            if (qty <= stock) {
                System.out.println(customer + " purchased " + qty + " item(s).");
                stock -= qty;
                System.out.println("Stock left: " + stock);
            } else {
                System.out.println(customer + " failed to purchase " + qty + " item(s). Not enough stock!");
            }
        }
    }
}

class CustomerThread extends Thread {
    private Inventory inventory;
    private String customerName;
    private int qty;

    public CustomerThread(Inventory inventory, String customerName, int qty) {
        this.inventory = inventory;
        this.customerName = customerName;
        this.qty = qty;
    }

    public void run() {
        inventory.purchase(customerName, qty);
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        CustomerThread c1 = new CustomerThread(inv, "Alice", 4);
        CustomerThread c2 = new CustomerThread(inv, "Bob", 3);
        CustomerThread c3 = new CustomerThread(inv, "Charlie", 5);

        c1.start();
        c2.start();
        c3.start();
    }
}

