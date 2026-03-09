// Last updated: 3/9/2026, 10:57:56 PM
1class Solution {
2    public boolean kLengthApart(int[] nums, int k) {
3        int n = nums.length;
4        int counter = n+1;
5        for(int i = 0; i<n; i++){
6            if(nums[i]==1){
7                if(counter<k){
8                    return false;
9                } 
10                counter = 0;
11            }
12            else counter++;
13        }
14    return true;
15        
16    }
17}