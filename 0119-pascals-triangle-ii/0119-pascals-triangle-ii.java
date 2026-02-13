class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i=1; i<=rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j=0; j<row.size()-1; j++) {
                list.add(row.get(j)+row.get(j+1));
            }
            list.add(1);
            row = list;
        }
        return row;
    }
}