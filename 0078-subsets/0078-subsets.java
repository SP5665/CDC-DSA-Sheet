class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        formSubset(nums, 0, new ArrayList<>(), list);
        return list;
    }
    public static void formSubset(int nums[],int i,List<Integer> ans,List<List<Integer>> list) {
        if (i == nums.length) {
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        formSubset(nums, i+1, ans, list);
        ans.remove(ans.size()-1);
        formSubset(nums, i+1, ans, list);
    }    
}