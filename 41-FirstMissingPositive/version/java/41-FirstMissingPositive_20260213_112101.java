// Last updated: 2/13/2026, 11:21:01 AM
// It was solved in O(nlogn) T.C.
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        int k = 0;
6        if(nums[n-1]<0) return 1;
7        for(int i = 0; i<n; i++){
8            if(nums[i]<=0) continue;
9            if(nums[i]!=1) return 1;
10            else {k = i; break;}
11        }
12        for(int i = k; i<n-1; i++){
13            if(nums[i+1]==nums[i]) continue;
14            if(nums[i+1]!=nums[i]+1) return nums[i]+1;
15        }
16        return nums[n-1]+1;
17    }
18}