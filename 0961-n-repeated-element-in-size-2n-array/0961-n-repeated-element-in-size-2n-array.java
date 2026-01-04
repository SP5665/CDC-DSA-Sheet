class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (hs.contains(num)) return num;
            else hs.add(num);
        }
        return 0;
    }
}