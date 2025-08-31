class StudentOL {
    String name;
    int age;

    
    StudentOL() {
        this("Unknown", 0); 
    }

    
    StudentOL(String name) {
        this(name, 0); 
    }


    StudentOL(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        StudentOL s1 = new StudentOL();                 
        StudentOL s2 = new StudentOL("Joydeep");       
        StudentOL s3 = new StudentOL("Joydeep", 21);    

        s1.display();
        s2.display();
        s3.display();
    }
}

