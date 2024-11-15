package problems.easy;

import java.util.HashMap;

public class DominantIndex {
    public static void main(String[] args) {
        int[] arr = {3,6,1,0};
        int dominantIndex = dominantIndex(arr);
        System.out.println(dominantIndex);
    }

    public static int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == maxIndex) continue;
            if (max < 2 * nums[i]) return -1;
        }
        return maxIndex;
    }
}
