class Solution {
    public int[] searchRange(int[] nums, int target) {
        int m=-1; int n=-1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==target) {
                if(m==-1) {
                    m=i;
                }
                n=i;
            }
        }
        return new int[]{m,n};
    }
}