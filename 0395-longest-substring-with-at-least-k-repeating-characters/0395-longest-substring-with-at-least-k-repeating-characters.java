class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i=0; i<n; i++) {
            if (freq[s.charAt(i) - 'a'] < k) { //bad character
                //left of bad character
                int left = longestSubstring(s.substring(0, i), k);
                //right of bad character
                int right = longestSubstring(s.substring(i + 1), k);
                return Math.max(left, right);
            }
        }
        return n;
    }
}