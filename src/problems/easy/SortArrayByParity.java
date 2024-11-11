package problems.easy;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int[] newArr = sortArrayByParity(arr);
        System.out.println("Sorted array: " + Arrays.toString(newArr));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int writePointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (i != writePointer) {
                    int temp = nums[i];
                    nums[i] = nums[writePointer];
                    nums[writePointer] = temp;
                }
                writePointer++;
            }
        }
        return nums;
    }
}
