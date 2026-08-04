class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        // r - rows
        //  c - columns

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char current = board[r][c];

                if (current == '.') {
                    continue;
                }

                int num = current - '1';
                int boxNum = (r / 3) * 3 + (c / 3);

                if (rows[r][num] || cols[c][num] || boxes[boxNum][num]) {
                    return false;
                } else {
                    rows[r][num] = true;
                    cols[c][num] = true;
                    boxes[boxNum][num] = true;
                }
            }
        }
        return true;
    }
}
