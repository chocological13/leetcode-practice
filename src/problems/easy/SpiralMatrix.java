package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        if (matrix == null || m == 0) {
            return result;
        }

        // boundaries
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (left <= right && top <= bottom) {
            // traverse right -> left to right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // traverse down -> top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // traverse left -> left to right
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                // traverse up -> bottom to top
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
