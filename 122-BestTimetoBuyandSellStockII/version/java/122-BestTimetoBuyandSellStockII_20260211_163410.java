// Last updated: 2/11/2026, 4:34:10 PM
// Optimal
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int min = Integer.MAX_VALUE;
5        int profit = 0;
6        for(int i = 0; i<n-1; i++){
7            if(prices[i+1]>prices[i]){
8                profit += (prices[i+1] - prices[i]);
9            }
10        }
11        return profit;
12    }
13}