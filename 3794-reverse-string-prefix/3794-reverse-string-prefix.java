class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int i=0, j=k-1;
        while (i<j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}