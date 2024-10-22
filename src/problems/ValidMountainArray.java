package problems;

public class ValidMountainArray {
    public static void main(String[] args) {
//        int[] arr = {0,3,2,1};
        int[] arr = {9, 8, 7};
        System.out.println("Is valid mountain array: " + validMountainArray(arr));
        System.out.println("Is valid mountain array with method 2: " + validMountainArray2(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }
        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
            if (arr[i] < arr[i + 1]) {
                increasing = true;
            }
            if (increasing) {
                if (arr[i] > arr[i + 1]) {
                    decreasing = true;
                }
            }
            if (decreasing) {
                if (arr[i] < arr[i + 1]) {
                    return false;
                }
            }
        }
        return (increasing && decreasing);
    }

    public static boolean validMountainArray2(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }

        int i = 0;
        int lastIndex = arr.length - 1;

        // walk up
        while (i < lastIndex && arr[i] < arr[i + 1]) {
            i++;
        }

        // check for peak
        if (i == 0 || i == lastIndex) {
            return false;
        }

        // walk down
        while (i < lastIndex && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == lastIndex;

    }
}
