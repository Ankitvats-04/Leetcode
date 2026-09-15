class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int i=1; i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxprofit = maxprofit+(prices[i]-prices[i-1]);
            }
        }
        return maxprofit;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna