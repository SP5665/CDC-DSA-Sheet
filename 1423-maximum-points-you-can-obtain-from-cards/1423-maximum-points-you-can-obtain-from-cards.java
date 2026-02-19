class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for (int card : cardPoints) {
            total += card;
        }
        int left = 0, right = n-k;
        int score = 0;
        
        while (right <= n) {
            int subScore = 0;
            for (int i=left; i<right; i++) {
                subScore += cardPoints[i];
            }
            score = Math.max(score, total - subScore);
            left++;
            right++;
        }

        return score;
    }
}