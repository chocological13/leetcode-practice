package problems;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int res = removeElement(nums, val);
        System.out.println("Result: " + res);
        System.out.println("Nums: " + Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            // move and replace only when it's not the val
           if (nums[i] != val) {
               nums[k] = nums[i];
               k++;
           }
        }
        return k;
    }
}
