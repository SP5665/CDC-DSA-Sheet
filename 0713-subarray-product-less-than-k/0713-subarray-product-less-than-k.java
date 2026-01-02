class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0, n = nums.length;
        int i = 0, j = 0;
        int num = 1;
        while (j < n) {
            num *= nums[j];
            while (i <= j && num >= k) {
                num /= nums[i];
                i++;
            }
            count += (j-i+1);
            j++;
        }
        return count;
    }
}