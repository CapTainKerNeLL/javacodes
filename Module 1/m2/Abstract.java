package m2;
abstract class Shape {
    abstract void draw(); 

    void message() { 
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Shape s = new Circle(); 
        s.message();
        s.draw();
    }
}
