class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;

        for(int i=1; i<prices.length; i++){
            int profit = prices[i]-minprice;

            minprice = Math.min(minprice,prices[i]);
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna