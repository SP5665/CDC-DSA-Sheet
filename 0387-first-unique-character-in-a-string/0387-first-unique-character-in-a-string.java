class Solution {
    public int firstUniqChar(String s) {
        int i=0;
        for (i=0; i<s.length(); i++) {
            int j=0;
            for (j=0; j<s.length(); j++) {
                if (s.charAt(i)==s.charAt(j) && i!=j) break;
            }
            if (j==s.length())
            return i;
        }
        return -1;
    }
}