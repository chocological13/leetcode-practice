package problems;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println("Sorted squares: " + Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        // non-decreasing order, so we fill in the biggest result first
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        System.gc();
        return result;
    }
}
