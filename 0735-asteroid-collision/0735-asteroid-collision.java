class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for (int a : asteroids) {
            boolean toPush = true;
            while (!s.isEmpty() && a<0 && s.peek()>0) {
                if (Math.abs(a) > Math.abs(s.peek())) {
                    s.pop();
                } else if (Math.abs(a) == Math.abs(s.peek())) {
                    s.pop();
                    toPush = false;
                    break;
                } else {
                    toPush = false;
                    break;
                }
            }
            if (toPush) s.push(a);
        }
        int n = s.size();
        int[] ans = new int[n];
        for (int i=n-1; i>=0; i--) ans[i] = s.pop();
        return ans;
    }
}