package problems.easy;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSum(nums, target);
        System.out.println("Target indices are: " + Arrays.toString(indices));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based indexing
            }
            else if (sum < target) {
                left++;
            }
            else right--;
        }
        return new int[]{};
    }
}
