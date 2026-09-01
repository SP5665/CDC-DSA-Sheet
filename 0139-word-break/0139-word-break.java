class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()];
        return helper(s, 0, hs, dp);
    }
    private boolean helper(String s, int start, HashSet<String> hs, Boolean[] dp) {
        if (start == s.length()) return true;
        if (dp[start] != null) return dp[start];
        for (int i=start+1; i<=s.length(); i++) {
            if (hs.contains(s.substring(start, i)) &&
                helper(s, i, hs, dp)) {
                return dp[start] = true;
            }
        }
        return dp[start] = false;
    }
}