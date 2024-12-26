package problems.medium;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate2(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotate(int[][] matrix) {
        // make a copy of the matrix
        int[][] copy = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                copy[i][j] = matrix[i][j];
            }
        }

        // Keep track of which column from the original matrix we're copying from
        int colIndex = 0;

        // For each position in the matrix:
        // - The new row remains the same as we process the matrix row by row
        // - What was previously in the bottom row of column colIndex
        //   will now be in the first position of row 0, and so on
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                // To rotate 90° clockwise:
                // - Take values from the original matrix starting from bottom to top
                // - Place them left to right in the new matrix
                // matrix.length - 1 - col gives us the row index from bottom to top
                // colIndex gives us the current column we're copying from
                matrix[row][col] = copy[matrix.length - 1 - col][colIndex];

            }

            // move to the next column in the original matrix
            colIndex++;
        }
    }

    public static void rotate2(int[][] matrix) {
        /**
         * Rotates a square matrix 90 degrees clockwise in-place by:
         * 1. Transposing the matrix (flipping across main diagonal)
         * 2. Reversing each row
         *
         * Example transformation:
         * 1 2 3    →    1 4 7    →    7 4 1
         * 4 5 6    →    2 5 8    →    8 5 2
         * 7 8 9    →    3 6 9    →    9 6 3
        */

        // transpose the matrix, flip diagonally
        for (int i = 0; i < matrix.length; i++) {
            // only swap half the matrix bc we are swapping pairs, so we start j from i
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse row
        for (int i = 0; i < matrix.length; i++) {
            // we only need to go halfway through the row because we are swapping pairs
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
