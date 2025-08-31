public class ControlStructures {
    public static void main(String[] args) {
        int num = 5;

        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

        switch (num) {
            case 1: System.out.println("One"); break;
            case 5: System.out.println("Five"); break;
            default: System.out.println("Other");
        }

        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

