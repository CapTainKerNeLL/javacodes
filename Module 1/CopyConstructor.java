
class PersonCopy {
    String name;
    int age;

    PersonCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    PersonCopy(PersonCopy other) {
        if (other == null) {
            this.name = "Unknown";
            this.age = 0;
        } else {
            this.name = other.name;
            this.age = other.age;
        }
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        PersonCopy p1 = new PersonCopy("Alice", 25);
        PersonCopy p2 = new PersonCopy(p1); 
        p1.name = "Alice Modified";
        p1.age = 26;

        System.out.println("Original (p1):");
        p1.show();

        System.out.println("Copy (p2):");
        p2.show();
    }
}


