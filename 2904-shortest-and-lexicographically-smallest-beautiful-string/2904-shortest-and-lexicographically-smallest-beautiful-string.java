class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<Integer> idx = new ArrayList<>(); //0 4 5 8
        int n = s.length();
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == '1') idx.add(i);
        }
        int min = Integer.MAX_VALUE;
        String ans = "";
        for (int c = 0; c+k-1 < idx.size(); c++) {
            int i = idx.get(c);
            int j = idx.get(k + c - 1);
            String sub = s.substring(i, j + 1);
            if (sub.length() < min ||
                (sub.length() == min && sub.compareTo(ans) < 0)) {
                ans = sub;
                min = sub.length();
            }
        }
        return ans;
    }
}