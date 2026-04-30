class Solution {
    public int compareBitonicSums(int[] nums) {
        long asc = nums[0];
        int i=1;
        for (; i<nums.length; i++) {
            if (nums[i] > nums[i-1]) asc+=nums[i];
            else break;
        }
        long desc = nums[i-1];
        for (; i<nums.length; i++) {
            desc+=nums[i];
        }
        if (asc > desc) return 0;
        else if (desc > asc) return 1;
        else return -1;
    }
}