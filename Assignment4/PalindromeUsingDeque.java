package Assignment4;

import java.util.*;

class PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(input + " is Palindrome? " + isPalindrome);
    }
}

