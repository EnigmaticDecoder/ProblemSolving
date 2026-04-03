// Last updated: 4/3/2026, 12:21:01 PM
1class Solution {
2    public int findUnsortedSubarray(int[] nums) {
3        int n = nums.length;
4        int start = 0;
5        int end = -1;
6        int copy [] = Arrays.copyOf(nums,n);
7        Arrays.sort(copy);
8        boolean flag = true;
9        for(int i = 0; i<n; i++){
10            if(flag && copy[i]!=nums[i]){
11                start = i;
12                flag = false;
13            }
14            if(copy[i]!=nums[i]){
15                end = i;
16            }
17        }
18        return end-start+1;
19
20    }
21}