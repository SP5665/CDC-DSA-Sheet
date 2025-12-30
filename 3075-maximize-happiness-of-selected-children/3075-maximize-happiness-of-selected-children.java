class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i = happiness.length-1;
        long res = 0;
        int val = 0;
        while (k>0) {
            long a = happiness[i--]-val;
            if (a<=0) break;
            res += a;
            val++;
            k--;
        }
        return res;
    }
}