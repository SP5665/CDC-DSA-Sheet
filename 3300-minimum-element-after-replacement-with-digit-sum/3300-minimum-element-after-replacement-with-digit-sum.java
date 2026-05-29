class Solution {
    public int minElement(int[] nums) {
        int min = nums[0];
        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            int val = 0;
            while (num > 0) {
                val += num%10;
                num /= 10;
            }
            nums[i] = val;
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}