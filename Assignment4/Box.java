package Assignment4;

class Box<T> {
    private T item;

    public void addItem(T item) { this.item = item; }
    public T getItem() { return item; }
}

class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello");
        System.out.println("String Box: " + stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.addItem(100);
        System.out.println("Integer Box: " + intBox.getItem());
    }
}

