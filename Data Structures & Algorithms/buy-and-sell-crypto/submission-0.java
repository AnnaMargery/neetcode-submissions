class Solution {
    public int maxProfit(int[] prices) {
        // nums[i] - purchase price
        // nums[j] - sell price
        //  we are looking the max of nums[j]- num[i]- so the profit
        //  if there is ay profit, so rate isnt good or equal to 0- we can return 0
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int current = prices[j] - prices[i];
                if (max < current) {
                    max = current;
                }
            }
        }
        return max > 0 ? max : 0;
    }
}
