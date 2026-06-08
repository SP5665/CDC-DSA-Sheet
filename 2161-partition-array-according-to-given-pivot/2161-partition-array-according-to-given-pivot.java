class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        int p = 0;
        int q = n - 1;
        while (p < n) {
            if (nums[p] < pivot) {
                ans[left++] = nums[p];
            }
            if (nums[q] > pivot) {
                ans[right--] = nums[q];
            }
            p++;
            q--;
        }
        while (left <= right) {
            ans[left++] = pivot;
        }
        return ans;
    }
}