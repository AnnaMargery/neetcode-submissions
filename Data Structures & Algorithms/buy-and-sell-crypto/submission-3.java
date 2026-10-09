class Solution {
    public int maxProfit(int[] prices) {
        //we can't choose a different day for selling the stocks
        if(prices.length == 0) return 0;

        // profit when the day we want to sell has greater value
        // prices[0]- first day when we can buy, prices[1] - first day when we can sell
        // we will check othed days in the future and compare the difference

        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while(right< prices.length){
            int currentBuy = prices[left];
            int currentSell = prices[right];
            if(currentBuy < currentSell){
                int currentProfit = currentSell - currentBuy;
                maxProfit = Math.max(maxProfit, currentProfit);
            } else{
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
