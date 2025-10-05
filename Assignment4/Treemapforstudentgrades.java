package Assignment4;

import java.util.*;

public class TreeMapGrades {
    public static void main(String[] args) {
        TreeMap<String, String> grades = new TreeMap<>();
        grades.put("Aditi", "A");
        grades.put("Raj", "B");
        grades.put("Neha", "A+");

        System.out.println("Grades: " + grades);
        grades.remove("Raj");
        System.out.println("After removal: " + grades);
        System.out.println("Aditi's grade: " + grades.get("Aditi"));
    }
}

