class Solution {
    public int nthUglyNumber(int n) {
        int[] primes = {2, 3, 5};
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> visited = new HashSet<>();
        
        pq.add(1L);
        visited.add(1L);
        
        long curr = 1L;
        for (int i=0; i<n; i++) {
            curr = pq.poll();
            for (int prime : primes) {
                long new_ugly = curr * prime;
                if (!visited.contains(new_ugly)) {
                    pq.add(new_ugly);
                    visited.add(new_ugly);
                }
            }
        }
        return (int)curr;
    }
}