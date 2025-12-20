class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int c = 0, len = 0;
        for (int i=0; i<nums.length; i++) {
            c += nums[i]==1 ? 1 : -1;
            if (hm.containsKey(c))
                len = Math.max(len, i-hm.get(c));
            else hm.put(c,i);
        }
        return len;
    }
}