class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : words) {
            if (s.length() >= k) {
                String prefix = s.substring(0, k);
                hm.put(prefix, hm.getOrDefault(prefix, 0)+1);
            }
        }
        int grp = 0;
        for (String key : hm.keySet()) {
            if (hm.get(key) > 1) grp++;
        }
        return grp;
    }
}