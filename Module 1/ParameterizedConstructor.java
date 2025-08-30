class Car {
    String brand;
    int year;


    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 2022);
        c1.display();
    }
}

