public class FactorialRec {
    static long factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}

