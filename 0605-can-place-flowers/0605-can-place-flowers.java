class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0) return true;
        int len = flowerbed.length;
        if (len==1) {
            if (flowerbed[0]==0) return true;
            else return false;
        }
        if (len==2) {
            if (n>1) return false;
            else if (flowerbed[0]==0 && flowerbed[1]==0) return true;
            else return false;
        }
        int i=0;
        while (i<len) {
            if (i==0) {
                if (flowerbed[i]==0 && flowerbed[i+1]==0) {
                    n-=1;
                    flowerbed[i]=1;
                }
            }
            else if (i==len-1) {
                if (flowerbed[i]==0 && flowerbed[i-1]==0) {
                    n-=1;
                    flowerbed[i]=1;
                }
            }
            else if (flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0) {
                n-=1;
                flowerbed[i]=1;
            }
            i++;
            if (n==0) return true;
        }
        return false;
    }
}