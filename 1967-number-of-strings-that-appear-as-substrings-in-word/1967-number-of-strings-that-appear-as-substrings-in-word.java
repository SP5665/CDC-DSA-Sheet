class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for (String w : patterns) {
            if (word.contains(w)) c++;
        }
        return c;
    }
}