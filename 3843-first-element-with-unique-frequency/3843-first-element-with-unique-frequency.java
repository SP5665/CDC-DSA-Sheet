class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        Map<Integer, Integer> freqCount = new LinkedHashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for (int key : freq.keySet()) {
            freqCount.put(freq.get(key), freqCount.getOrDefault(freq.get(key), 0)+1);
        }
        int val = -1;
        for (int key : freqCount.keySet()) {
            if (freqCount.get(key) == 1) {
                val = key;
                break;
            }
        }
        for (int key : freq.keySet()) {
            if (freq.get(key) == val) {
                return key;
            }
        }
        return -1;
    }
}