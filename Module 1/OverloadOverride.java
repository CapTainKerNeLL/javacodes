class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        return super.add(a, b) + 10;
    }
}

public class OverloadOverride {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5, 10));     
        System.out.println(c1.add(5.5, 2.5));  

        Calculator c2 = new AdvancedCalculator();
        System.out.println(c2.add(5, 10));    
    }
}
