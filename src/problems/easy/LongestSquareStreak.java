package problems.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestSquareStreak {

  public static void main(String[] args) {
    int[] nums = {4,16,256,65536};
    int longestSquareStreak = longestSquareStreak(nums);
    System.out.println("Longest square streak: " + longestSquareStreak);
  }

  public static int longestSquareStreak(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }

    int maxStreak = -1;

    for (int num : nums) {
      if (!set.contains((int)Math.sqrt(num))) { // Only check numbers that could start a sequence
        int streak = 1;
        long next = (long) num * num;

        while (next <= Integer.MAX_VALUE && set.contains((int)next)) {
          streak++;
          next = next * next;
        }

        if (streak >= 2) {
          maxStreak = Math.max(maxStreak, streak);
        }
      }
    }

    return maxStreak;
  }

}
