package problems.medium;

import static java.lang.Math.min;

public class MinimumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int currentWindowSum = 0;
        int result = Integer.MAX_VALUE;

        // using sliding window
        // this loop moves the right window
        for (right = 0; right < nums.length; right++) {
            currentWindowSum += nums[right];

            // this loop moves the left window if the current sum is more than or equals to the target
            while (currentWindowSum >= target) {

                // window length will be the number of indices
                // the result will the one that has the shortest window length
                int windowLength = right - left + 1;
                result = min(result, windowLength);

                // increment the left window and subtract that num from the sum
                currentWindowSum -= nums[left++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
