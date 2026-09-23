class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0, n = nums.length;
        for (int num : nums) total += num;
        int target = total-x, left=0, sum=0, maxLen=-1;
        for (int right=0; right<n; right++) {
            sum += nums[right];
            while (sum>target && left<=right) {
                sum -= nums[left];
                left++;
            }
            if (sum == target) {
                maxLen = Math.max(maxLen, right-left+1);
            }
        }
        if (maxLen == -1) return -1;
        return n - maxLen;
    }
}