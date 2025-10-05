package Assignment4;

import java.util.*;

public class ProductTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();
        products.put("Laptop", 75000.0);
        products.put("Phone", 40000.0);
        products.put("Watch", 15000.0);

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " - ₹" + entry.getValue());
        }
    }
}

