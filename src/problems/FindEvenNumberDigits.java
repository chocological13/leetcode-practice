package problems;

public class FindEvenNumberDigits {
    public static void main(String[] args) {
        int[] arr = { 12,345,2,6,7896};
        System.out.println("Even numbers in digits are: " + findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        int evenDigit = 0;
        for (int num : nums) {
            while (num != 0) {
                count++;
                num /= 10;
            }
            if (count % 2 == 0) {
                evenDigit++;
            }
            count = 0;

        }
        return evenDigit;
    }
}
