class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for (int i=n2-1; i>=0; i--) {
            int keyIdx = linearSearch(nums1, nums2[i], n1);
            if (keyIdx != -1) {
                while (!s.isEmpty() && s.peek()<=nums2[i]) {
                    s.pop();
                }
                nums1[keyIdx] = s.isEmpty()? -1 : s.peek();
            }
            s.push(nums2[i]);
        }
        return nums1;
    }
    public int linearSearch(int[] nums, int key, int n) {
        for (int i=0; i<n; i++) {
            if (nums[i] == key) return i;
        }
        return -1;
    }
}