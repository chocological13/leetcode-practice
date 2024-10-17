import problems.RunningSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] sum = {1, 2, 3, 4, 5};
        System.out.println("Running sum of sum: " + Arrays.toString(RunningSum.runningSum(sum)));
    }
}