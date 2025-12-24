class Solution {
    public boolean lemonadeChange(int[] bills) {
        int is5 = 0;
        int is10 = 0;
        for (int b : bills) {
            if (b == 5) is5++;
            else if (b == 10) {
                if (is5==0) return false;
                is5--;
                is10++; 
            }
            else {
                if (is10 > 0 && is5 > 0) {
                    is10--;
                    is5--;
                }
                else if (is5 >= 3) is5 -= 3; 
                else return false;
            }
        }
        return true;
    }
}