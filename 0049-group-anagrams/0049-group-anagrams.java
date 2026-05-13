class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            char[] w = s.toCharArray();
            Arrays.sort(w);
            String sortedWord = new String(w);
            if (!hm.containsKey(sortedWord)) {
                hm.put(sortedWord, new ArrayList<>());
            }
            hm.get(sortedWord).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}