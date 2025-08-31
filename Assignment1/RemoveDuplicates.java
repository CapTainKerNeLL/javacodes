import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,3,5};
        Set<Integer> set = new LinkedHashSet<>();
        for(int num: arr) set.add(num);

        System.out.println("Without duplicates: " + set);
    }
}
