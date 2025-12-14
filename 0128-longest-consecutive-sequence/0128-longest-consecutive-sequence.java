class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length, max=0;
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) hs.add(num);
        for (int num : hs) {
            int c=0;
            if (!hs.contains(num-1)) {
                while (hs.contains(num)) {
                    c++;
                    num++;
                }
                max = Math.max(max, c);
            }
        }
        return max;
    }
}