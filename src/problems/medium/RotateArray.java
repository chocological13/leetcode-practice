package problems.medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k  = k % nums.length;

        // reverse left sub array
        reverse(nums, 0, nums.length - k - 1);

        // reverse right sub array (the one that will be rotated to the start)
        reverse(nums, nums.length - k, nums.length - 1);

        // reverse everything to get the right sub array to the start
        reverse(nums, 0, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        int left = start, right = end;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
