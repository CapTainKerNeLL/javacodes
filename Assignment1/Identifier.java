public class Identifier {

    int age = 25;
    int $salary = 50000;
    int _marks = 90;
    int number123 = 123;

    public static void main(String[] args) {
        Identifier obj = new Identifier();
        System.out.println("Age = " + obj.age);
        System.out.println("Salary = " + obj.$salary);
        System.out.println("Marks = " + obj._marks);
        System.out.println("Number = " + obj.number123);
    }
}
