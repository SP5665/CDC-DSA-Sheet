class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (hm.containsKey(sChar)) {
                if (hm.get(sChar) != tChar) return false;
            }
            else {
                if (!hm.containsValue(tChar)) {
                    hm.put(sChar, tChar);
                }
                else return false;
            }
        }
        return true;
    }
}