class Solution {
    public boolean isPalindrome(String s) {
        if (s==" ") return true;
        s=s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");
        int beg=0; int end=s.length()-1;
        while (beg<end) {
            if (s.charAt(beg)!=s.charAt(end)) {
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }
}