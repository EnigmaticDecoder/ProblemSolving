// Last updated: 4/3/2026, 11:32:42 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n = nums.length;
4        int max = Integer.MIN_VALUE;
5        int sum = 0;
6        for(int i = 0; i<n; i++){
7            sum+=nums[i];
8            max = Math.max(max,sum);
9            if(sum<0) sum = 0;
10        }
11        return max;
12    }
13}