class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        int max = 0;
        if (k>n) {
            for (int num : arr) max = Math.max(max, num);
            return max;
        }
        int i=0, j=1, c=0;
        while (j<n) {
            if (arr[i] > arr[j]) {
                c++;
            }
            else {
                i=j;
                c=1;
            }
            j++;
            if (c>=k) return arr[i];
        }
        return arr[i];
    }
}