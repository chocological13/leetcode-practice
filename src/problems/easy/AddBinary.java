package problems.easy;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String sum = addBinary(a, b);
        System.out.println("Sum of a and b is " + sum);
    }

    public static String addBinary(String a, String b) {
        // 0 + 0 = 1
        // 1 + 0 = 0
        // 0 + 1 = 0
        // 1 + 1 = 10


        StringBuilder result = new StringBuilder();

        // in the case of 1 + 1 = 10
        int carry = 0;

        // two pointer from the end of the string
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            // subtract by '0' to turn the char into int
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            // sum is > 1, that means there's a carry value
            carry = sum > 1 ? 1 : 0;

            // mod sum with 2 to get the binary
            result.append(sum % 2);
        }

        if (carry != 0) result.append(carry);

        return result.reverse().toString();
    }
}
