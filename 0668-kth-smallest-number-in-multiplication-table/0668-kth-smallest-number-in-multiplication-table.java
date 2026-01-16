class Solution {
    public int findKthNumber(int m, int n, int k) {
        int beg=0, end=m*n;
        while (beg<end) {
            int c=0;
            int mid = beg + (end-beg)/2;
            for (int i=1; i<=m; i++) {
                c += Math.min(n, mid/i); //i*j<=mid -> j<=mid/i
            }
            if (c>=k) end = mid;
            else beg = mid+1;
        }
        return beg;
    }
}