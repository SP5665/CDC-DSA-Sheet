class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n==1) return "";
        boolean change = false;
        StringBuilder sb = new StringBuilder(palindrome);
        for (int i=0; i<n; i++) {
            char c = palindrome.charAt(i);
            if (c != 'a' && palindrome.charAt(n-i-1) != 'a' && i != (n-i-1)) {
                change = true;
                sb.setCharAt(i, 'a');
                break;
            }
        }
        if (!change) sb.setCharAt(n-1, 'b');
        return sb.toString();
    }
}