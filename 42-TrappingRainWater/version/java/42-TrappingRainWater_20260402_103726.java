// Last updated: 4/2/2026, 10:37:26 AM
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int leftmax = height[0];
5        int water = 0;
6        for(int i = 0; i<n; i++){
7            int rightmax = 0;
8            if(height[i]>leftmax) leftmax = height[i];
9
10            for(int j = i; j<n; j++){
11                rightmax = Math.max(rightmax,height[j]);
12                }
13
14            water += Math.min(leftmax,rightmax) - height[i];
15        }
16        return water;
17    }
18}