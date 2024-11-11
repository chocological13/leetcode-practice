package problems.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        // cases where nums is null or only has 1
        if (nums == null)
            return 0;
        if (nums.length == 1)
            return 1;

        // start from 1 because the first one is always unique
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

}
