class Solution {
    public int minimumPushes(String word) {
        int c = 1, ans = 0;
        for (int i=0; i<word.length(); i++) {
            ans += c;
            if ((i+1)%8 == 0) c++;
        }
        return ans;
    }
}