class Solution {
    public int pivotInteger(int n) {
        int sum = (n*(n+1))/2;
        // sum = ((n-x)*(n-x+1)/2)
        // x = root of sum
        int x = (int)Math.sqrt(sum);
        if (x*x == sum) return x;
        else return -1;
    }
}