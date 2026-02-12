// Last updated: 2/12/2026, 6:56:43 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i<n-1; i++){
            if(prices[i+1]>prices[i]){
                profit += (prices[i+1] - prices[i]);
            }
        }
        return profit;
    }
}