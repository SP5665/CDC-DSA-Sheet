class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int a1=0, a2=0;
        int n1 = nums1.length, n2 = nums2.length;
        for (int i=0; i<n1; i++) {
            if (contains(nums2, nums1[i])) a1++;
        }
        for (int i=0; i<n2; i++) {
            if (contains(nums1, nums2[i])) a2++;
        }
        return new int[] {a1, a2};
    }
    public boolean contains(int[] arr, int target) {
        for (int a : arr) {
            if (a == target) return true;
        }
        return false;
    }
}