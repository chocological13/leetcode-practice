package problems.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();

        // check if there's any empty string
        for (String str : strs) {
            if (str.isEmpty()) {
                return ans.toString();
            }
        }

        // sort the strings
        Arrays.sort(strs);

        // get the first and last string (bc they are the most different from each other)
        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();

    }
}
