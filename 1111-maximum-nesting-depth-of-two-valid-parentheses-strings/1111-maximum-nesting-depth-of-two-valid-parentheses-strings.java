class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<n; i++) {
            char c = seq.charAt(i);
            if (c == '(') {
                if (i%2==0) ans[i] = 0;
                else ans[i] = 1;
                st.push(i);
            } else {
                if (ans[st.peek()] == 0) ans[i] = 0;
                else ans[i] = 1;
                st.pop();
            }
        }
        return ans;
    }
}