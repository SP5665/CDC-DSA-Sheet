class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs = new HashSet<>();
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                char b = board[i][j];
                if (hs.contains(b)) return false;
                if (b != '.') hs.add(b);
            }
            hs.clear();
        }
        hs.clear();
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                char b = board[j][i];
                if (hs.contains(b)) return false;
                if (b != '.') hs.add(b);
            }
            hs.clear();
        }
        hs.clear();
        int i=0, j=0;
        while (i<9) {
            while (j<9) {
                for (int k=0; k<3; k++) {
                    for (int l=0; l<3; l++) {
                        char b = board[i+k][j+l];
                        if (hs.contains(b)) return false;
                        if (b != '.') hs.add(b);
                    }
                }
                hs.clear();
                j+=3;
            }
            hs.clear();
            i+=3;
            j=0;
        }
        return true;
    }
}