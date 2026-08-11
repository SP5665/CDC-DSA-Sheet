class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        Set<Integer> hs = new HashSet<>(n);
        for (int num : nums) {
            hs.add(num);
        }
        int sum = nums[0];
        for (int i=1; i<n; i++) {
            if (nums[i] == nums[i-1] + 1) sum += nums[i];
            else break;
        }
        while (hs.contains(sum)) sum++;

        return sum;
    }
}