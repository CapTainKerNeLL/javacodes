package Assignment4;

import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class CustomObjectSortDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Aditi", 85),
                new Student("Raj", 90),
                new Student("Neha", 80)
        );

        students.sort(Comparator.comparingInt(s -> s.marks));
        System.out.println("Sorted by marks: " + students);
    }
}

