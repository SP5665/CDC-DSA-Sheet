class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        char[] ans = new char[n];
        int j=0;
        for (int i=0; i<26; i++) {
            char c = (char)('a' + i);
            int half = freq[i] / 2;
            while (half-- > 0) {
                ans[j] = c;
                ans[n-j-1] = c;
                j++;
            }
            if (freq[i] % 2 == 1) {
                ans[n/2] = c;
            }
        }
        return new String(ans);
    }
}