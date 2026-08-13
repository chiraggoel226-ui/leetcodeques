class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;

        // Knight tour must start from (0,0)
        if (grid[0][0] != 0) {
            return false;
        }

        int[][] pos = new int[n * n][2];

        // Store the position of every move number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pos[grid[i][j]][0] = i;
                pos[grid[i][j]][1] = j;
            }
        }

        // Check whether consecutive moves are valid knight moves
        for (int move = 1; move < n * n; move++) {
            int r1 = pos[move - 1][0];
            int c1 = pos[move - 1][1];

            int r2 = pos[move][0];
            int c2 = pos[move][1];

            int dr = Math.abs(r1 - r2);
            int dc = Math.abs(c1 - c2);

            // Knight moves: (1,2) or (2,1)
            if (!((dr == 1 && dc == 2) || (dr == 2 && dc == 1))) {
                return false;
            }
        }

        return true;
    }
}