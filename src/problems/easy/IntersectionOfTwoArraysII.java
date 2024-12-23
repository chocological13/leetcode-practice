package problems.easy;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        // determine the shortest array
        if (nums2.length < nums1.length) {
            return intersection(nums2, nums1);
        }

        // make a map for the frequency
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums1) {
            frequency.merge(num, 1, Integer::sum);
        }

        // build result array, we use the shorter array length
        int[] result = new int[nums1.length];
        int index = 0;

        // check intersection
        for (int num : nums2) {
            int count = frequency.getOrDefault(num, 0);
            if (count > 0) {
                result[index++] = num;
                frequency.put(num, --count);
            }
        }

        // trim the array to the index count
        return Arrays.copyOf(result, index);
    }
}
