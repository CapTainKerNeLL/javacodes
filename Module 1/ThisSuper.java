class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void showNames() {
        System.out.println("this.name = " + this.name);
        System.out.println("super.name = " + super.name);
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.showNames();
    }
}

