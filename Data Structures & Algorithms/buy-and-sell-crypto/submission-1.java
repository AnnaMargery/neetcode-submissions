class Solution {
    public int maxProfit(int[] prices) {
        // nums[i] - purchase price
        // nums[j] - sell price
        //  we are looking the max of nums[j]- num[i]- so the profit
        //  if there is ay profit, so rate isnt good or equal to 0- we can return 0

        int purchase = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < purchase) {
                purchase = prices[i];
            } else if (prices[i] - purchase > maxProfit) {
                maxProfit = prices[i] - purchase;
            }
        }
        return maxProfit;
    }
}
