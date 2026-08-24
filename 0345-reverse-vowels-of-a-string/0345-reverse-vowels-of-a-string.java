class Solution {
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        while (i<j) {
            while (i<j && vowels.indexOf(sb.charAt(i)) < 0) {
                i++; 
            }
            while (i<j && vowels.indexOf(sb.charAt(j)) < 0) {
                j--; 
            }
            if (i>j) break;
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}