package problems.easy;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqueChar(s));
    }

    public static int firstUniqueChar(String s) {
        // initialize int array of size 26 (the alphabet) to store frequency
        // iterate through string and mark frequency
        // iterate through string again to find the first occurrence of 1

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return  i;
            }
        }

        return -1;
    }
}
