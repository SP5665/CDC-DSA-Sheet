class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;
        //[low, high] = range of no. of open brackets
        for (char c : s.toCharArray()) {
            if (c == '(') {
                //range increases as open bracket increases
                low++;
                high++;
            } else if (c == ')') {
                //range decreases as open bracket decreases
                if (low > 0) low--; // decrease low only if possible
                high--;
            }
            //treating all * as ')' is low and as '(' is high
            else {
                //with *, range expands, if ')', low++ and if '(', high--
                if (low > 0) low--; //min possible '('
                high++; //max possible '('
            }
            //high<0 means, more ')' than '('
            //treating all * as '(', still high<0, then impossible
            if (high<0) return false;
        }
        //min open brackets == 0?, if yes then there exists atleast 1
        //interpretation of * for a valid answer
        return low==0;
    }
}