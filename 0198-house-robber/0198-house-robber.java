class Solution {
    public int rob(int[] nums) {
        int max0=0;
        int max1=0;
        for(int i=0; i<nums.length; i++) {
            int newMax1=max0+nums[i];
            int newMax0=Math.max(max0, max1);
            max0=newMax0;
            max1=newMax1;
        }
        return Math.max(max0,max1);
    }
}