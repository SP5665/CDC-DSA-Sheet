class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0, c1=0, row=0;
        for (int i=mat.length-1; i>=0; i--) {
            int count = 0;
            for (int j=0; j<mat[0].length; j++) {
                if (mat[i][j] == 1) count++;
            }
            max = Math.max(max, count);
            if (max == count) {
                row = i;
                c1 = count;
            }
        }
        return new int[] {row, c1};
    }
}