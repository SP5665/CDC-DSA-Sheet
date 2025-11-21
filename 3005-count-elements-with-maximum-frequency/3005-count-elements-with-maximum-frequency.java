class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int c = 0, max = 0;
        for (Integer key : hm.keySet()) {
            max = Math.max(max, hm.get(key));
        }
        for (Integer key : hm.keySet()) {
            if (hm.get(key) == max) c++;
        }
        return max*c;
    }
}