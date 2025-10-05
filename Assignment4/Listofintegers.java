package Assignment4;

import java.util.*;

class Listofintegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

    
        System.out.println("Simple for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\nEnhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nWhile loop with Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

