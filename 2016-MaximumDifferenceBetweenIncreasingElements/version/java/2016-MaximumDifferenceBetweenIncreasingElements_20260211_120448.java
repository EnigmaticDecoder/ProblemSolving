// Last updated: 2/11/2026, 12:04:48 PM
// Optimal
1class Solution {
2    public int maximumDifference(int[] nums) {
3        int n = nums.length;
4        int min = nums[0];
5        int max = -1;
6        for(int i = 0; i<n; i++){
7            if(nums[i]>min){
8                int diff = nums[i]- min;
9                max = Math.max(max,diff);
10            }
11            else {
12                min = nums[i];
13            }
14        }
15        return max;
16    }
17}