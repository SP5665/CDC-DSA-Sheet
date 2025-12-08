class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        char tChar[]=t.toCharArray();
        char sChar[]=s.toCharArray();
        Arrays.sort(tChar);
        Arrays.sort(sChar);
        return Arrays.equals(tChar, sChar);
    }
}