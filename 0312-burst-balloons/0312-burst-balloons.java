class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] a = new int[n+2];
        a[0] = a[n+1] = 1;
        for (int i=0; i<n; i++) a[i+1] = nums[i];

        int[][] dp = new int[n+2][n+2];

        for (int len=2; len <= n+1; len++) {
            for (int i=0; i+len <= n+1; i++) {
                int j = i+len;
                for (int k = i+1; k<j; k++) {
                    dp[i][j] = Math.max(
                                dp[i][j],
                                dp[i][k] + dp[k][j] + a[i] * a[k] * a[j]
                            );
                }
            }
        }
        return dp[0][n+1];
    }
}