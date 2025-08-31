final class FinalClass {} 

class Demo {
    final int VALUE = 100; 

    final void display() {
        System.out.println("This method cannot be overridden");
    }
}

public class Final {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("Final variable: " + d.VALUE);
        d.display();
    }
}

