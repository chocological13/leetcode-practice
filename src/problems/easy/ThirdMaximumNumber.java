package problems.easy;

public class ThirdMaximumNumber {

  public static void main(String[] args) {
    int[] nums = {2, 2, 3, 1};
    int thirdMax = thirdMax(nums);
    System.out.println("Third max: " + thirdMax);
  }

  public static int thirdMax(int[] nums) {
    long firstMax = Long.MIN_VALUE;
    long secondMax = Long.MIN_VALUE;
    long thirdMax = Long.MIN_VALUE;
    int count = 0;  // Track number of distinct values we've seen

    for (int num : nums) {
      // Skip duplicates
      if (num == firstMax || num == secondMax || num == thirdMax) {
        continue;
      }

      count++;  // Found a new distinct number
      if (num > firstMax) {
        thirdMax = secondMax;
        secondMax = firstMax;
        firstMax = num;
      } else if (num > secondMax) {
        thirdMax = secondMax;
        secondMax = num;
      } else if (num > thirdMax) {
        thirdMax = num;
      }
    }

    // Return third max only if we've found at least 3 distinct numbers
    return count >= 3 ? (int)thirdMax : (int)firstMax;
  }
}
