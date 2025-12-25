class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        Set<Character> hs = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (hm.containsKey(sChar)) {
                if (hm.get(sChar) != tChar) return false;
            }
            else {
                if (!hs.contains(tChar)) {
                    hm.put(sChar, tChar);
                    hs.add(tChar);
                }
                else return false;
            }
        }
        return true;
    }
}