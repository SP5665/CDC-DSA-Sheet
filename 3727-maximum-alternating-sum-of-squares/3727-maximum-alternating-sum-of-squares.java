class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for (int i=0; i<n; i++) nums[i] = Math.abs(nums[i]);
        Arrays.sort(nums);
        for (int i=0; i<n/2; i++) {
            sum -= Math.pow(nums[i], 2);
        }
        for (int i=n/2; i<n; i++) {
            sum += Math.pow(nums[i], 2);
        }
        return sum;
    }
}