class MathUtils {

    static int square(int x) {
        return x * x;
    }

    int cube(int x) {
        return x * x * x;
    }
}

public class StaticNonStatic {
    public static void main(String[] args) {
        System.out.println("Square of 5 = " + MathUtils.square(5));

        MathUtils obj = new MathUtils();
        System.out.println("Cube of 5 = " + obj.cube(5));
    }
}

