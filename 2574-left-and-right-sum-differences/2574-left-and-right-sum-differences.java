class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 0;
        suffix[n-1] = 0;
        for (int i=0; i<n-1; i++) {
            prefix[i+1] = prefix[i] + nums[i];
            suffix[n-i-2] = suffix[n-i-1] + nums[n-i-1];
        }
        for (int i=0; i<n; i++) {
            nums[i] = Math.abs(prefix[i] - suffix[i]);
        }
        return nums;
    }
}