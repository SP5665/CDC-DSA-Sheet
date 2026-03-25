class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;
		s.push(0);
		for (int i=1; i<n; i++) {
			if (s.isEmpty() || temperatures[i] < temperatures[s.peek()]) s.push(i);
			else {
				while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) { 
					int val = s.pop();
					temperatures[val] = i-val;
				}
				s.push(i);
			}
		}
		while (!s.isEmpty()) temperatures[s.pop()] = 0;
		return temperatures;
    }
}