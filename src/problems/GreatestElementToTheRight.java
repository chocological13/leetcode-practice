package problems;

import java.util.Arrays;
import java.util.HashMap;

public class GreatestElementToTheRight {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] newArr = replaceElements(arr);
        System.out.println("Replaced Elements: " + Arrays.toString(newArr));
    }

    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
        }

        int n = arr.length;
        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }
}
