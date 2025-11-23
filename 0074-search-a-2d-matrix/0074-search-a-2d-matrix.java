class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int arr[] : matrix) {
            boolean bs=binarySearch(arr,target);
            if (bs==true) return true;
        }
        return false;
    }
    public boolean binarySearch(int[] arr, int target) {
        int beg=0; int end=arr.length-1;
        while (beg<=end) {
            int mid=(beg+end)/2;
            if (arr[mid]==target) return true;
            else if (arr[mid]>target)
            end=mid-1;
            else
            beg=mid+1;
        }
        return false;
    }
}