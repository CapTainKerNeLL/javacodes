public class SplitString {
    public static void main(String[] args) {
        String str = "Java is powerful";
        String[] words = str.split(" ");

        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
