package Assignment4;

import java.util.*;

public class ToDoListApp {
    private static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        addTask("Buy groceries");
        addTask("Finish project");
        displayTasks();
        removeTask("Buy groceries");
        displayTasks();
    }

    static void addTask(String task) {
        tasks.add(task);
    }

    static void removeTask(String task) {
        tasks.remove(task);
    }

    static void displayTasks() {
        System.out.println("To-Do List: " + tasks);
    }
}


