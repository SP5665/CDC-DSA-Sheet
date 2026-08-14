class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int i=0, j=0, c=0, max=0;
        while (j<s.length()) {
            char cj = s.charAt(j);
            hm.put(cj, hm.getOrDefault(cj, 0)+1);
            while (hm.get(cj) > 2) {
                char ci = s.charAt(i);
                hm.put(ci, hm.get(ci)-1);
                i++;
            }
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}