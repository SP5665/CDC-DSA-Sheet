class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;
        int n = s.length();
        for (int i=1; i<=26; i++) {
            HashMap<Character, Integer> hm = new HashMap<>();
            int l = 0;
            int r = 0;
            int unique = 0;
            int atLeastK = 0;
            while (r < n) {
                char c = s.charAt(r);
                hm.put(c, hm.getOrDefault(c, 0)+1);
                if (hm.get(c) == 1) unique++;
                if (hm.get(c) == k) atLeastK++;
                r++;
                while (unique > i) {
                    char ch = s.charAt(l);
                    if (hm.get(ch) == k) atLeastK--;
                    hm.put(ch, hm.get(ch) - 1);
                    if (hm.get(ch) == 0) {
                        hm.remove(ch);
                        unique--;
                    }
                    l++;
                }
                if (unique == i && unique == atLeastK) {
                    ans = Math.max(ans, r-l);
                }
            }
        }
        return ans;
    }
}