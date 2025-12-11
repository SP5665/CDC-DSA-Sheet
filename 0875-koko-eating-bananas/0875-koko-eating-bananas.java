class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for (int pile : piles) max = Math.max(max, pile);
        int beg = 1, end = max;
        while (beg < end) {
            int k = beg + (end-beg)/2; //mid
            if (canFinish(piles, h, k)) end = k;
            else beg = k+1;
        }
        return beg;
    }
    public boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            int d = pile/k;
            hours = (pile % k == 0)? hours + d : hours + d+1; //ceil(pile/k)
        }
        return !(hours > h); //cant finish
    }
}