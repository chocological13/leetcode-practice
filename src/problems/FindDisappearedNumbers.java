package problems;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

  public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    List<Integer> disappearedNumbers = findDisappearedNumbers(arr);
    System.out.println("Disappeared numbers: " + disappearedNumbers);
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    int length = nums.length;
    boolean[] count = new boolean[length + 1];
    List<Integer> disappearedNumbers = new ArrayList<>();

    for (int num : nums) {
      count[num] = true;
    }

    for (int i = 1; i < length + 1; i++) {
      if (!count[i]) {
        disappearedNumbers.add(i);
      }
    }

    return disappearedNumbers;
  }


}
