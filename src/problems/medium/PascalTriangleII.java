package problems.medium;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> row = getRow(rowIndex);
        System.out.println(row);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        // always starts with 1
        row.add(1);
        long prev = 1; // initiate the prev value with 1 for the first index, using long for precision

        // iterate from 1 (2nd index to the row) to the value of rowIndex
        for (int i = 1; i <= rowIndex; i++) {
            // binomial coefficient
            long next = prev * (rowIndex - i + 1) / i;
            row.add((int) next);
            prev = next;
        }

        return row;
    }
}
