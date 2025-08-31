public class trycatch {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            int result = a / b;
            System.out.println("Result (try-catch): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught in try-catch: " + e.getMessage());
        }

        try {
            int result = a / b;
            System.out.println("Result (try-catch-finally): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught in try-catch-finally: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}