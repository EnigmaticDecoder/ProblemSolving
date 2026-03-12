// Last updated: 3/12/2026, 12:02:31 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        int min = n+1;
6        int l = 0;
7        int r = 0;
8        for(int i = 0; i<n; i++){
9            sum+=nums[i];
10            while(sum>=target){
11                min = Math.min(min,i-l+1);
12                sum-=nums[l++];
13            }
14        }
15        if(min == n+1) return 0;
16        else return min;
17    }
18}
19