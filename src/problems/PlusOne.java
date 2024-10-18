package problems;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {1, 2, 9};
        System.out.printf("Plus One: %s%n", Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // if the current digit is not 9 (if we add 1, it won't be 10 or become 2 digits)
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

}
