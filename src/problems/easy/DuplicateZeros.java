package problems.easy;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
//        int[] arr = {8, 4, 5, 0, 0, 0, 0, 7};
        duplicateZeros(arr);
        System.out.println("Duplicated zeros: " + Arrays.toString(arr));
    }

    //    public static void duplicateZeros(int[] arr) {
//        int n = arr.length;
//        int[] res = new int[n];
//        int resIndex = 0;
//        int index = 0;
//        while (resIndex < n) {
//            System.out.println("Loop start: " + Arrays.toString(res));
//            res[resIndex] = arr[index];
//            if (arr[index] == 0) {
//                res[resIndex++] = arr[index];
//            }
//            System.out.println("Loop end: " + Arrays.toString(res));
//            resIndex++;
//            index++;
//            System.out.println("resIndex: " + resIndex);
//            System.out.println("index: " + index);
//        }
//        System.arraycopy(res, 0, arr, 0, n);
//    }
    public static void duplicateZeros(int[] arr) {
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        int i = arr.length - 1;
        int j = i + zeros;
        while (i >= 0) {
            if (j < arr.length) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                j--;
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            }
            i--;
            j--;
        }
    }
}
