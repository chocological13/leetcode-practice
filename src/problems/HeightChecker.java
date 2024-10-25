package problems;

import java.util.Arrays;

public class HeightChecker {

  public static void main(String[] args) {
    int[] heights = {1,1,4,2,1,3};
    int heightCheck = heightChecker(heights);
    System.out.println("Heights not as expected: " + heightCheck);
  }

  public static int heightChecker(int[] heights) {
    // height is between 1 - 100, so max array is 101 (indices 1-100)
    int[] count = new int[101];

    // put the height in the count array
    for (int height : heights) {
      count[height]++;
    }

    int mismatches = 0;
    int currentHeight = 0; // the height we expect to see

    for (int height : heights) {

      // find next expected height (non-zero count)
      while (count[currentHeight] == 0) {
        currentHeight++;
      }

      if (height != currentHeight) {
        mismatches++;
      }

      // decrease count for this height since we've used it
      count[currentHeight]--;
    }
    return mismatches;

  }
}
