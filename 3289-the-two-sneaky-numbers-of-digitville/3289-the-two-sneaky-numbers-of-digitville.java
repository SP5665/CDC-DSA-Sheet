class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int[] ans = new int[2];
        int j=0;
        for (int num : nums) {
            if (hs.contains(num)) ans[j++] = num;
            else hs.add(num);
        }
        return ans;
    }
}