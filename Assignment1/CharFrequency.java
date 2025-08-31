import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (char c : freq.keySet()) {
            System.out.println(c + " → " + freq.get(c));
        }
    }
}
