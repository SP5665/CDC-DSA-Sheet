class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        for (int i=0; i<n; i++) {
            lst.add(new ArrayList<>());
        }
        for (int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            lst.get(u).add(v);
            lst.get(v).add(u);
        }
        int c = 0;
        boolean[] visited = new boolean[n];
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                int[] result = dfs(lst, i, visited);
                int v = result[0];
                int e = result[1]/2;
                if (e == v*(v-1)/2) c++;
            }
        }
        return c;
    }
    public static int[] dfs(ArrayList<ArrayList<Integer>> lst, int curr, boolean[] visited) {
        visited[curr] = true;
        int v = 1;
        int e = lst.get(curr).size();
        for (int neigh : lst.get(curr)) {
            if (!visited[neigh]) {
                int[] result = dfs (lst, neigh, visited);
                v += result[0];
                e += result[1];
            }
        }
        return new int[] {v, e};
    }
}