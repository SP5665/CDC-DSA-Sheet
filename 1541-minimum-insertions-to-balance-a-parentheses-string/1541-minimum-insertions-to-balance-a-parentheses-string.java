class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') st.push(ch);
            else {
                if (i+1 < s.length() && s.charAt(i+1) == ')') i++;
                else ans++;
                if (!st.isEmpty()) st.pop();
                else ans++;
            }
        }
        ans += st.size() * 2;
        return ans;
    }
}