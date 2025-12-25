class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 0;
        suffix[n-1] = 0;
        for (int i=0; i<n-1; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }
        for (int i=n-1; i>0; i--) {
            suffix[i-1] = suffix[i] + nums[i];
        }
        for (int i=0; i<n; i++) {
            nums[i] = Math.abs(prefix[i] - suffix[i]);
        }
        return nums;
    }
}