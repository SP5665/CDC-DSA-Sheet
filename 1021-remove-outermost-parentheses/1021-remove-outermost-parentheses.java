class Solution {
    public String removeOuterParentheses(String s) {
        int sum = 0; int j = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') sum++;
            else sum--;
            if (i!=j && sum!=0) sb.append(s.charAt(i));
            else if (sum == 0) j=i+1;
        }
        return sb.toString();
    }
}