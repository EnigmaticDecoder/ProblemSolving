// Last updated: 4/3/2026, 12:35:47 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int n = nums.length;
4        int count = 0;
5        for(int i = 0; i<n; i++){
6            int product = 1;
7            for(int j = i; j<n; j++){
8                product*=nums[j];
9                if(product<k) count++;
10                else break;
11            }
12        }
13        return count;
14    }
15}