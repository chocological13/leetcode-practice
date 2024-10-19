package problems;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println("Max consecutive ones: " + findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            }

            // change count to 0 when it's not 1
            else {
                count = 0;
            }

            // updates the last one before returning
            if (count > max) {
                max = count;
            }
        }
        System.gc();
        return max;
    }
}
