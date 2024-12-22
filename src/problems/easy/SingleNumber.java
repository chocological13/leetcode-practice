package problems.easy;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        // Sort the array first so all pairs of numbers will be adjacent
        Arrays.sort(nums);

         // Iterate through the array with steps of 2 to check pairs of numbers
        for (int i =1 ; i < nums.length; i += 2) {
            // If current number doesn't match previous number,
            // we've found our unpaired number
            if (nums[i] != nums[i-1]) {
                // Return the unpaired number (the previous number)
                return nums[i - 1];
            }
        }

        // If we've gone through all pairs without finding the single number,
        // it means the last element is the unpaired one
        return nums[nums.length - 1];
    }
}
