class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    return dfs(grid, r, c);
                }
            }
        }
        return -1;
    }

    private int dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return 1;
        }
        if (grid[r][c] == 0) {
            return 1;
        }
        if (grid[r][c] == -1) {
            return 0;
        }
        grid[r][c] = -1;

        int result = 0;
        result += dfs(grid, r - 1, c);
        result += dfs(grid, r + 1, c);
        result += dfs(grid, r, c - 1);
        result += dfs(grid, r, c + 1);

        return result;
    }
}