class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for (String ch : tokens) {
            if (!s.isEmpty() && (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/"))) {
                int b = s.pop();
                int a = s.pop();
                if (ch.equals("+")) {
                    res = a+b;
                }
                else if (ch.equals("-")) {
                    res = a-b;
                }
                else if (ch.equals("*")) {
                    res = a*b;
                }
                else if (ch.equals("/")) {
                    res = a/b;
                }
                s.push(res);
            }
            else s.push(Integer.parseInt(ch));
        }
        return s.peek();
    }
}