package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        System.out.println("Pascal's Triangle: " + result);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        if (numRows == 1) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
            return result;
        }

        // recursion
        result = generate(numRows - 1);

        List<Integer> prevRow = result.get(numRows - 2);
        List<Integer> currentRow = new ArrayList<>();

        currentRow.add(1); // **first and last in array is 1
        // iterate through the middle of the prev rows and add the adjacent members
        for (int i = 1; i < numRows - 1; i++) {
            currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }
        currentRow.add(1); // **

        // add the current row to result
        result.add(currentRow);

        return result;
    }
}
