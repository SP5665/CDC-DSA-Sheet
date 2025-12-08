class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for (int i=1; i<arr.length; i++) {
            int c=0;
            int temp=i;
            while (temp!=0) {
                if ((temp&1)==1) c++;
                temp=temp>>1;
            }
            arr[i]=c;
        }
        return arr;
    }
}