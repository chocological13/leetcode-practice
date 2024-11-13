package problems.easy;

public class FindMiddleIndex {
    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
    public static int findMiddleIndex(int[] nums) {
        int left = 0;
        int right = 0;

        for (int num : nums) {
            right += num;
        }

        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }

        return -1;
    }
}
