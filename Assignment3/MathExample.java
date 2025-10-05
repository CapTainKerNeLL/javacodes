package Assignment3;

public class MathExample {
    public static void main(String[] args) {
        // Math.random() generates a random number between 0.0 and 1.0
        double randomValue = Math.random();
        System.out.println("Random Value: " + randomValue);

        // Math.abs() returns the absolute value
        int negativeNumber = -25;
        System.out.println("Absolute Value of -25: " + Math.abs(negativeNumber));

        // Math.pow() calculates power
        double powerResult = Math.pow(2, 5); // 2^5
        System.out.println("2^5 = " + powerResult);
    }
}
