package m2;


final class FinalClass {
    final void display() {
        System.out.println("Final method inside a final class.");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}

