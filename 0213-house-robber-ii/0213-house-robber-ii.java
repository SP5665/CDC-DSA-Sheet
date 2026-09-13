class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] dp1 = Arrays.copyOfRange(nums, 0, n - 1);
        int[] dp2 = Arrays.copyOfRange(nums, 1, n);
        dp1[1] = Math.max(dp1[0], dp1[1]);
        dp2[1] = Math.max(dp2[0], dp2[1]);
        for (int i = 2; i < dp1.length; i++) {
            dp1[i] = Math.max(dp1[i-1], dp1[i-2] + nums[i]);
        }
        for (int i = 2; i < dp2.length; i++) {
            dp2[i] = Math.max(dp2[i-1], dp2[i-2] + nums[i+1]);
        }
        return Math.max(dp1[dp1.length - 1], dp2[dp2.length - 1]);
    }
}