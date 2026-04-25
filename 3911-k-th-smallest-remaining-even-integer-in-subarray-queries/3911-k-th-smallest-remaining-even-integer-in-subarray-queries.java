class Solution {
    public int[] kthRemainingInteger(int[] nums, int[][] queries) {
        int[] clesimvora = nums;

        int q = queries.length;
        int[] ans = new int[q];

        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                list.add(new int[]{i, nums[i] / 2});
            }
        }

        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];

            int left = 0, right = list.size() - 1;
            int start = list.size();

            while (left <= right) {
                int mid = (left + right) / 2;
                if (list.get(mid)[0] >= l) {
                    start = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            left = 0;
            right = list.size() - 1;
            int end = -1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (list.get(mid)[0] <= r) {
                    end = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (start > end) {
                ans[i] = 2 * k;
                continue;
            }

            int lo = 1, hi = end - start + 1;
            int best = 0;

            while (lo <= hi) {
                int mid = (lo + hi) / 2;

                int val = list.get(start + mid - 1)[1];

                if (val < k + mid) {
                    best = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            ans[i] = 2 * (k + best);
        }

        return ans;
    }
}