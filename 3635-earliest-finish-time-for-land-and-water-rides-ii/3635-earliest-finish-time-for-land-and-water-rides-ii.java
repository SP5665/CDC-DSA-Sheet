class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minLandEnd = Integer.MAX_VALUE;
        int minWaterEnd = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;

        int n = landStartTime.length;
        int m = waterStartTime.length;

        // Earliest finishing land ride
        for (int i = 0; i < n; i++) {
            minLandEnd = Math.min(
                minLandEnd,
                landStartTime[i] + landDuration[i]
            );
        }
        // Land -> Water
        // Also find earliest finishing water ride
        for (int i = 0; i < m; i++) {
            minWaterEnd = Math.min(
                minWaterEnd,
                waterStartTime[i] + waterDuration[i]
            );
            answer = Math.min(
                answer,
                Math.max(minLandEnd, waterStartTime[i]) + waterDuration[i]
            );
        }
        // Water -> Land
        for (int i = 0; i < n; i++) {
            answer = Math.min(
                answer,
                Math.max(minWaterEnd, landStartTime[i]) + landDuration[i]
            );
        }
        return answer;
    }
}