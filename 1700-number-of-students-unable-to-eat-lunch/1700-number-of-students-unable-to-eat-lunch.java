class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Queue<Integer> q = new LinkedList<>();
       for (int s : students) q.add(s);
       int i=0, c=0;
       while (!q.isEmpty()) {
            if (i >= sandwiches.length || c>q.size()) break;
            int val = q.poll();
            if (val == sandwiches[i]) {
                i++;
                c=0;
            }
            else {
                q.offer(val);
                c++;
            }
       }
       return q.size();
    }
}