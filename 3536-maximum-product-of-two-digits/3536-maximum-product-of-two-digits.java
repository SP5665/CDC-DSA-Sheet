class Solution {
    public int maxProduct(int n) {
        String num = String.valueOf(n);
        int len = num.length();
        char[] arr = new char[len];
        int j = 0;
        for (int i=0; i<len; i++) {
            arr[j++] = num.charAt(i);
        }
        Arrays.sort(arr);
        int n1 = arr[len-1] - '0';
        int n2 = arr[len-2] - '0';
        return n1*n2;
    }
}