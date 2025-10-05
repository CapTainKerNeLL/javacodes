package Assignment4;

class Main {
    public static <T> void swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        swapElements(intArray, 0, 2);
        System.out.println("Swapped Integers: " + java.util.Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C"};
        swapElements(strArray, 1, 2);
        System.out.println("Swapped Strings: " + java.util.Arrays.toString(strArray));
    }
}

