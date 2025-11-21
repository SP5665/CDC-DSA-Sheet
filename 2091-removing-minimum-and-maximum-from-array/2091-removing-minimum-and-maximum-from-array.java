class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0, maxIdx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }
        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);
        
        int ops1 = right + 1;
        int ops2 = n - left;
        int ops3 = (left + 1) + (n - right);

        return Math.min(ops1, Math.min(ops2, ops3));
    }
}