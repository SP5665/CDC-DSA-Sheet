class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0; i<numCourses; i++) adj.add(new ArrayList<>());
        int[] indegree = new int[numCourses]; //no.of prerequisites each course has
        for (int[] p : prerequisites) {
            if (p[0] == p[1]) return false;
            adj.get(p[1]).add(p[0]); //to start p[0], completep[1]
            indegree[p[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }
        int course = 0; //no. of courses completed
        while (!q.isEmpty()) {
            int node = q.poll();
            course++;
            for (int neigh : adj.get(node)) {
                indegree[neigh]--;
                if (indegree[neigh] == 0) q.offer(neigh);
            }
        }
        return course == numCourses;
    }
}