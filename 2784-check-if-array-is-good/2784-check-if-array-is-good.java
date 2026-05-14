class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 1) return false;
        if (n == nums[n-1]+1) {
            int c = 1;
            for (int i=0; i<n-1; i++) {
                if (c != nums[i]) return false;
                c++;
            }
            if (nums[n-1] == nums[n-2]) return true;
        }
        return false;
    }
}