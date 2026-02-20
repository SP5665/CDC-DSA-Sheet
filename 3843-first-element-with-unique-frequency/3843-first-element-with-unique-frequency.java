class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        Map<Integer, Integer> freqCount = new LinkedHashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for (int val : freq.values()) {
            freqCount.put(val, freqCount.getOrDefault(val, 0)+1);
        }
        for (int num : nums) {
            if (freqCount.get(freq.get(num)) == 1) {
                return num;
            }
        }
        return -1;
    }
}