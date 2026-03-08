// Last updated: 3/8/2026, 12:04:30 PM
1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) {
3        int n = capacity.length;
4        int result = 101;
5        int j = 0;
6        for(int i = 0; i<n; i++){
7            if(capacity[i]>=itemSize && capacity[i]<result){
8                result = capacity[i];
9                j = i;
10            }
11        }
12        if(result == 101) return -1;
13        else return j;
14    }
15}