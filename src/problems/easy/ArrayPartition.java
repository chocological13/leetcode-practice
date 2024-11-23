package problems.easy;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println("Max possible sum: " + arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
