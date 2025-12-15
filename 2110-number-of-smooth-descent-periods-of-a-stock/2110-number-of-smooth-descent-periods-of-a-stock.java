class Solution {
    public long getDescentPeriods(int[] prices) {
        int c = 1;
        long total = 1;
        for (int i=1; i<prices.length; i++) {
            if (prices[i] == prices[i-1]-1) c++;
            else c=1;
            total+=c;
        }
        return total;
    }
}