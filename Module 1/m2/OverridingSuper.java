package m2;


class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        super.show(); 
        System.out.println("Child class method (overridden)");
    }
}

public class OverridingSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
