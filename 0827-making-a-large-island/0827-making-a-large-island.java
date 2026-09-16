class Solution {
    int n;
    public int largestIsland(int[][] grid) {
        n = grid.length;
        HashMap<Integer, Integer> area = new HashMap<>();
        int islandId = 2;
        for (int r=0; r<n; r++) {
            for (int c=0; c<n; c++) {
                if (grid[r][c] == 1) {
                    int size = dfs(grid, r, c, islandId);
                    area.put(islandId, size);
                    islandId++;
                }
            }
        }
        int answer = 0;
        for (int size : area.values()) {
            answer = Math.max(answer, size);
        }
        for (int r=0; r<n; r++) {
            for (int c=0; c<n; c++) {
                if (grid[r][c] != 0) continue;
                int newArea = 1;
                HashSet<Integer> seen = new HashSet<>();
                if (r+1 < n && grid[r+1][c] > 1) {
                    int id = grid[r+1][c];
                    // seen.add(id): if id already added -> True, else False
                    if (seen.add(id)) newArea += area.get(id);
                }
                if (r-1 >= 0 && grid[r-1][c] > 1) {
                    int id = grid[r-1][c];
                    if (seen.add(id)) newArea += area.get(id);
                }
                if (c+1 < n && grid[r][c+1] > 1) {
                    int id = grid[r][c+1];
                    if (seen.add(id)) newArea += area.get(id);
                }
                if (c-1 >= 0 && grid[r][c-1] > 1) {
                    int id = grid[r][c-1];
                    if (seen.add(id)) newArea += area.get(id);
                }
                answer = Math.max(answer, newArea);
            }
        }
        return answer;
    }
    private int dfs(int[][] grid, int r, int c, int id) {

        if (r<0 || r>=n || c<0 || c>=n || grid[r][c] != 1) return 0;
        grid[r][c] = id;
        int size = 1;

        size += dfs(grid, r+1, c, id);
        size += dfs(grid, r-1, c, id);
        size += dfs(grid, r, c+1, id);
        size += dfs(grid, r, c-1, id);

        return size;
    }
}