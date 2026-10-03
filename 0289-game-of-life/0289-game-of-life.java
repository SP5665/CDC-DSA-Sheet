class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] ans = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int c = live(board, i, j);
                if (c<2 || c>3) ans[i][j] = 0;
                else if (c==3 && board[i][j] == 0) ans[i][j] = 1;
                else if ((c==2 || c==3 ) && board[i][j] == 1) ans[i][j] = 1;
            }
        }
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = ans[i][j];
            }
        }
    }
    public static int live(int[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;

        // (-1,-1)  (-1,0)  (-1,+1)
        // (+0,-1)  ( 0,0)  (+0,+1)
        // (+1,-1)  (+1,0)  (+1,+1)
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        int count = 0;

        for (int k=0; k<8; k++) {
            int r = i+dr[k];
            int c = j+dc[k];
            if (r>=0 && r<m && c>=0 && c<n) {
                if (board[r][c] == 1) count++;
            }
        }
        return count;
    }
}