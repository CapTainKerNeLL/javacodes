package Assignment4;

import java.util.*;

public class BankingSystem {
    private static Map<Integer, Double> accounts = new HashMap<>();

    public static void main(String[] args) {
        createAccount(101, 5000);
        deposit(101, 1000);
        withdraw(101, 2000);
        System.out.println("Balance: " + getBalance(101));
    }

    static void createAccount(int id, double balance) {
        accounts.put(id, balance);
    }

    static void deposit(int id, double amount) {
        accounts.put(id, accounts.get(id) + amount);
    }

    static void withdraw(int id, double amount) {
        accounts.put(id, accounts.get(id) - amount);
    }

    static double getBalance(int id) {
        return accounts.get(id);
    }
}

