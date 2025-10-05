package Assignment4;

import java.util.*;

public class FrequencyDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C", "A", "B");
        int freq = Collections.frequency(list, "A");
        System.out.println("Frequency of A: " + freq);
    }
}


