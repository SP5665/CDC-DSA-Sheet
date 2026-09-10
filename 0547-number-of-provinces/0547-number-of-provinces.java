class Solution {
    public int findCircleNum(int[][] isConnected) {
        //   0 1 2 3
        // 0 1 0 0 1
        // 1 0 1 1 0
        // 2 0 1 1 1
        // 3 1 0 1 1
        int v = isConnected.length;
        int p = 0;
        boolean[] visited = new boolean[v];
        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                p++;
                dfs(isConnected, i, visited);
            }
        }
        return p;
    }
    public static void dfs(int[][] isConnected, int i, boolean[] visited) {
        visited[i] = true;
        for (int j=0; j<isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                dfs(isConnected, j, visited);
            }
        }
    }
}