class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n = asteroids.length;
        long curr = mass;
        for (int i=0; i<n; i++) {
            if (asteroids[i] > curr) return false;
            curr += asteroids[i];
        }
        return true;
    }
}