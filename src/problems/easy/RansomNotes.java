package problems.easy;

import java.util.HashMap;

public class RansomNotes {

    public static void main(String[] args) {

        String ransomNote = "aba";
        String magazine = "baa";
        System.out.println("Can Construct: " + canConstruct(ransomNote, magazine));
        System.out.println("Can Construct 2: " + canConstruct2(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            int count = map.getOrDefault(c, 0);

            // add count by 1 if it exists
            map.put(c, count + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            int count = map.getOrDefault(c, 0);

            if (count == 0) {
                return false;
            }

            // subtract the existence of the character
            map.put(c, count - 1);
        }
        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        for (char c : ransomNote.toCharArray()) {
            // look for char 'c' from index alphabet[c%26] in String 'magazine'
            int index = magazine.indexOf(c, alphabet[c%26]);
            if (index == -1) return false;

            // add the index +1 if found, next time the same char is searched for
            // it'll start from the index after the first one is found
            alphabet[c%26] = index + 1;
        }
        return true;
    }
}
