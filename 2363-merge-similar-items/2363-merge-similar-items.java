class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        for (int[] i : items1) {
            hm.put(i[0], i[1]);
        }
        for (int[] i : items2) {
            hm.put(i[0], hm.getOrDefault(i[0], 0)+i[1]);
        }
        List<List<Integer>> arr = new ArrayList<>();
        int i=0;
        for (int key : hm.keySet()) {
            arr.add(new ArrayList<>());
            arr.get(i).add(key);
            arr.get(i).add(hm.get(key));
            i++;
        }
        return arr;
    }
}