class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for (int card : cardPoints) {
            total += card;
        } //22

        int left = 0, right = n-k-1;
        int score = 0, subScore = 0;
        
        for (int i=0; i<=right; i++) {
            subScore += cardPoints[i];
        } //10

        while (right < n) {         
            score = Math.max(score, total - subScore);
            right++;
            if (right<n) subScore += cardPoints[right]; //17, 23, 24
            if (right<n) subScore -= cardPoints[left]; //16, 21, 21
            left++;
        }
        score = Math.max(score, total - subScore);
        return score;
    }
}