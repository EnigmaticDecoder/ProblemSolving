// Last updated: 2/11/2026, 12:24:38 PM
// Optimised using greedy algo
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int min = Integer.MAX_VALUE;
5        int maxprofit = 0;
6        for(int price : prices){
7            if(price>min){
8                int profit = price-min;
9                maxprofit = Math.max(maxprofit,profit);
10            }
11            else min = price;
12        }
13        return maxprofit;
14    }
15}