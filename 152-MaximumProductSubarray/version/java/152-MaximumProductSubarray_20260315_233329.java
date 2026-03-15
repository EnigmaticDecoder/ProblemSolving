// Last updated: 3/15/2026, 11:33:29 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length;
4        int max = Integer.MIN_VALUE;
5        for(int i = 0; i<n; i++){
6            int prod = 1;
7            for(int j = i; j<n; j++){
8                prod *= nums[j];
9                if(max<prod) max  = prod;
10            }
11        }
12        return max;
13    }
14}