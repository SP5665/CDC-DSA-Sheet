class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> hm = new HashMap<>();
        for (List<String> entry : knowledge) {
            hm.put(entry.get(0), entry.get(1));
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean bracket = false;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                bracket = true;
                continue;
            }
            else if (c == ')') {
                bracket = false;
                String key = sb.toString();
                if (!hm.containsKey(key)) ans.append('?');
                else ans.append(hm.get(key));
                sb.setLength(0);
                continue;
            }
            if (bracket) {
                sb.append(c);
            }
            else ans.append(c);
        }
        return ans.toString();
    }
}