package problems;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println("After moving zeroes: " + Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {

        int writePointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != writePointer) {
                    int temp = nums[i];
                    nums[i] = nums[writePointer];
                    nums[writePointer] = temp;
                }
                writePointer++;
            }
        }

    }
}
