package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram2(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        // check if length is same, if not return false
        if (s.length() != t.length()) {
            return false;
        }

        // initialize an int array of 26 to mark frequency of char
        int[] frequency = new int[26];

        // for all the char, increment s and decrement s
        // if it's an anagram, the end array should only contain 0
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        // return false if any of the content of the array is not 0
        for (int count : frequency) {
            if (count != 0) return false;
        }

        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequency.merge(s.charAt(i), 1, Integer::sum);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int count = frequency.getOrDefault(c, 0);
            if (count > 0) {
                frequency.put(c, count - 1);
            } else return false;
        }

        return true;
    }
}
