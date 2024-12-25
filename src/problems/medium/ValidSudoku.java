package problems.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] board) {
        // Create arrays of HashSets to track row, column, and box
        // We use HashSets because they store only unique member
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        // Initialize the HashSets
        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        // iterate through the board to check and add number into the set
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                // if board is empty, continue
                if (board[r][c] == '.') {
                    continue;
                }

                // get value
                char value = board[r][c];

                // determine which box we are in
                // in a 9x9 board, it means there are 3x3 boxes
                // for example board[0][0], board[0][1], board[0][2], board[1][0], board[1][1], board[1][2], board[2][0], board[2][1], board[2][2] belong to box[0]
                // 0 1 2
                // 3 4 5
                // 6 7 8
                // r / 3 -> 1 row has 9 members, divided by 3 to get the members that belongs to a box
                // multiply by 3 to get the starting int of the box -> 0 / 3 / 6
                // add c / 3 to determine the column index for the box
                int boxIndex = (r / 3) * 3 + c / 3;

                // if number exists in the set, return false
                if (row[r].contains(value) || col[c].contains(value) || box[boxIndex].contains(value)) {
                    return false;
                }

                // if not, add it to the set
                row[r].add(value);
                col[c].add(value);
                box[boxIndex].add(value);
            }
        }

        return true;
    }
}