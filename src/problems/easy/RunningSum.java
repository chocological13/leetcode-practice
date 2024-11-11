package problems.easy;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] sum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        sum = runningSum(sum);
        System.out.println("Running Sum: " + Arrays.toString(sum));
    }

    public static int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] runningSum = new int[length];
        runningSum[0] = nums[0];
        for (int i = 1; i < length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;
    }
}


