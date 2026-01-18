class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return possible(nums, target, 0, 0);
    }
    public int possible(int nums[], int tar, int idx, int sum){
        if (idx == nums.length) {
            return sum==tar ? 1 : 0;
        }
        int add = possible(nums, tar, idx+1, sum+nums[idx]);
        int sub = possible(nums, tar, idx+1, sum-nums[idx]);
        return add+sub;
    }
}