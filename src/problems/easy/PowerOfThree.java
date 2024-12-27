package problems.easy;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 3) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static boolean isPowerOfThree2(int n) {
        // 3 ^ 19 is the largest power of three before within the 32-bit integer
        // 3^19 should leave no remainder when mod by n
        return n > 0 && 1162261467 % n == 0;
    }
}
