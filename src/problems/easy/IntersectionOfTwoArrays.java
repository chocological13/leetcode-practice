package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] intersection = intersection2(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        // Create a set for the first array to make sure that it has unique numbers
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums1) {
            set.add(num);
        }

        // Create another set for the result and iterate through the second array to find matching numbers
        HashSet<Integer> resultSet  = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        // convert to int array before returning
        return resultSet.stream().mapToInt(i -> i).toArray();
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        // create a new array of boolean with the size of the possible content for nums1/nums2
        boolean[] bool1 = new boolean[1001];

        // set bool as true if the number exists in nums1
        for (int num : nums1) {
            bool1[num] = true;
        }

        // iterate through nums2 to find matches
        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (bool1[num]) {
                bool1[num] = false;
                result.add(num);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
