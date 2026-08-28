class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // [1,4,3,2], h = 9
        // 10 bananas in total

        // we are looking for a k- rate in which it will be possible to eat 10 bananas in a time
        // smaller than 9 hours !!!! we need to treat each part separetelty!!!

        int left = 1;
        int right = 0;
        int ans = right;

        for (int pile : piles) {
            if (right < pile) {
                right = pile;
            }
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long calc = countHours(piles, mid);
            // for this mid we need to calculate the hours for our mid rate
            if (calc <= h) {
                // it/s ok for this mid speed, but maybe we can find smaller
                ans = mid;
                right = mid - 1;
            } else {
                // this speed it is not sufficient, we need to recalculate mid
                left = mid + 1;
            }
        }
        return ans;
    }

    private long countHours(int[] piles, int k) {
        long sum = 0;

        for (int pile : piles) {
            sum += ((long) pile + k - 1) / k;
        }
        return sum;
    }
}
