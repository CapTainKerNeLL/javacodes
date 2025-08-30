public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] chars = str.toCharArray();
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}

