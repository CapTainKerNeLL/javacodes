package m3;

class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks on land.");
    }
}

class Doggy extends Mammal{
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Doggy d = new Doggy();
        d.eat();   
        d.walk();  
        d.bark();  
    }
}
