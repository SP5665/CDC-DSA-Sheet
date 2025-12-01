class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int prefix = 1, suffix = 1;
        for (int i=0; i<n; i++) {
            prefix = (prefix==0 ? 1:prefix);
            suffix = (suffix==0 ? 1:suffix);
            prefix*=nums[i];
            suffix*=nums[n-i-1];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
    }
}