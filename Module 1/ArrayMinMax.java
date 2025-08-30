public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}

