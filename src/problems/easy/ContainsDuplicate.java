package problems.easy;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> exist = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (exist.containsKey(nums[i])) {
                return true;
            } else {
                exist.put(nums[i], i);
            }
        }
        return false;
    }
}
