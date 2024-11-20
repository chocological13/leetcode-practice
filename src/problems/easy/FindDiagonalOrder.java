package problems.easy;

import java.util.Arrays;

public class FindDiagonalOrder {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] diagonalOrder = findDiagonalOrder(matrix);
        System.out.println("Diagonal order: " + Arrays.toString(diagonalOrder));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        if (n == 0 || m == 0) return new int[0];

        int[] diagonalOrder = new int[n * m];

        // pointers
        int i = 0;
        int j = 0;
        int index = 0;

        // direction
        boolean up = true;

        while (i < n && j < m) {
            if (up) {
                while(i > 0 && j < m - 1) {
                    diagonalOrder[index++] = mat[i][j];
                    i--;
                    j++;
                }
                diagonalOrder[index++] = mat[i][j];
                if (j == m - 1) i++;
                else j++;
                up = false;
            }
            else {
                while(i < n - 1 && j > 0) {
                    diagonalOrder[index++] = mat[i][j];
                    i++;
                    j--;
                }
                diagonalOrder[index++] = mat[i][j];
                if (i == n - 1) j++;
                else i++;
                up = true;
            }
        }
        return diagonalOrder;
    }
}
