class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (!hs.contains(num)) hs.add(num);
            else arr.add(num);
        }
        return arr;
    }
}