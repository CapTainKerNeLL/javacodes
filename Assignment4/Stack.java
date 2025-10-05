package Assignment4;

class Stack<T> {
    private java.util.ArrayList<T> list = new java.util.ArrayList<>();

    public void push(T item) { list.add(item); }
    public T pop() { return list.isEmpty() ? null : list.remove(list.size() - 1); }
    public T peek() { return list.isEmpty() ? null : list.get(list.size() - 1); }
}

class Main {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Popped: " + intStack.pop());

        Stack<String> strStack = new Stack<>();
        strStack.push("Hello");
        strStack.push("World");
        System.out.println("Peek: " + strStack.peek());
    }
}

