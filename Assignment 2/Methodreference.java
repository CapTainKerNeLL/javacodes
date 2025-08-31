interface SquareCalculator {
    int calculate(int x);
}

public class Methodreference {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        SquareCalculator calc = Methodreference::square;
        int result = calc.calculate(6);
        System.out.println("Square: " + result);
    }
}
