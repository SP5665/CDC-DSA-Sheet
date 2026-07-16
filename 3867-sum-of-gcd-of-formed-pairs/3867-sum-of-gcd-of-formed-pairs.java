class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int max = 0;
        for (int i=0; i<n; i++) {
            max = Math.max(max, nums[i]);
            arr[i] = gcds(nums[i], max);
        }
        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        long sum = 0;
        while (l<r) {
            sum+=gcds(arr[l], arr[r]);
            l++;
            r--;
        }
        return sum;
    }
    public int gcds(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
} 