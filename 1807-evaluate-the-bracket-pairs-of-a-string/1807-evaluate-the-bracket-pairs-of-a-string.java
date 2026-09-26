class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> hm = new HashMap<>();
        for (List<String> entry : knowledge) {
            hm.put(entry.get(0), entry.get(1));
        }
        StringBuilder ans = new StringBuilder();
        int i=0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                int start = ++i;
                while (s.charAt(i) != ')') {
                    i++;
                }
                String key = s.substring(start, i);
                ans.append(hm.getOrDefault(key, "?"));
                i++;
            } else {
                ans.append(s.charAt(i++));
            }
        }
        return ans.toString();
    }
}