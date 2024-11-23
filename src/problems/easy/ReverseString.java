package problems.easy;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        reverseString(a);
        System.out.println("Reversed string: " + Arrays.toString(a));
    }

    public static void reverseString(char[] s) {
        int n = s.length;
        int i = 0, j = n - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
