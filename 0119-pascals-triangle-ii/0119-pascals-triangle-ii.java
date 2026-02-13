class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        pascal.add(row);
        for (int i=1; i<=rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j=0; j<pascal.get(i-1).size()-1; j++) {
                list.add(pascal.get(i-1).get(j)+pascal.get(i-1).get(j+1));
            }
            list.add(1);
            pascal.add(list);
        }
        return pascal.get(rowIndex);
    }
}