class Person {
    String name;

    Person() {
        name = "Unknown";
    }

    Person(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Joydeep");
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
