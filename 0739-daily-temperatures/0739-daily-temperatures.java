class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
		s.push(0);
		for (int i=1; i<n; i++) {
			while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                int idx = s.pop();
                ans[idx] = i - idx;
            }
            s.push(i);
		}
		return ans;
    }
}