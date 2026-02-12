// Last updated: 2/12/2026, 6:56:44 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price : prices){
            if(price>min){
                int profit = price-min;
                maxprofit = Math.max(maxprofit,profit);
            }
            else min = price;
        }
        return maxprofit;
    }
}