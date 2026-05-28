class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') hs.add(ch);
        }
        for (char ch : word.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                char lower = (char)(ch+32);
                if (hs.contains(lower)) {
                    count++;
                    hs.remove(lower);
                }
            }
        }
        return count;
    }
}