class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] t : times) {
            graph.get(t[0]).add(new int[] {t[1], t[2]});
            // u -> {v, w}
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1]-b[1]);
        pq.offer(new int[] {k, 0});
        dist[k] = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int d = curr[1]; //shortest dist to reach this node
            if (d > dist[node]) continue;
            for (int[] neigh : graph.get(node)) {
                int val = neigh[0];
                int weight = neigh[1];
                if (dist[val] > d + weight) {
                    dist[val] = d + weight;
                    pq.offer(new int[] {val, dist[val]});
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i=1; i<n+1; i++) {
            if (dist[i] != Integer.MAX_VALUE)
                ans = Math.max(ans, dist[i]);
            else return -1;
        }
        return ans;
    }
}