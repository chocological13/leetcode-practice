package problems.easy;

public class NumberOfSteps {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int n) {
        if (n == 0) return 0;
        // add 1 to count the actual steps
        else if (n % 2 == 0) return 1 + numberOfSteps(n / 2);
        else return 1 + numberOfSteps(n - 1);
    }
}
