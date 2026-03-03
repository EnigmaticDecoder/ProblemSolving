// Last updated: 3/3/2026, 3:42:29 PM
1class Solution {
2    public int scoreDifference(int[] nums) {
3        int n = nums.length;
4        int player1 = 0;
5        int player2 = 0;
6        boolean flag = true;
7        for(int i = 0; i<n; i++){
8            if(nums[i]%2==1) flag = !flag;
9            if(i%6==5) flag = !flag;
10            if(flag) player1+=nums[i];
11            else player2+= nums[i];
12        }
13        return player1-player2;
14    }
15}