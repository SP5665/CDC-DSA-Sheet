class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        boolean ans[] = new boolean[n];
        int c = 0;
        Arrays.fill(ans, true);
        ans[0] = ans[1] = false;
        for (int i=2; i*i<n; i++) {
            if (ans[i]) {
                for (int j=i*i; j<n; j+=i) ans[j] = false;
            }
        }
        for (int i=2; i<n; i++) {
            if(ans[i]) c++;
        }
        return c;
    }
}