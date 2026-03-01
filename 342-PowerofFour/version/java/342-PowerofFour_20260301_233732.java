// Last updated: 3/1/2026, 11:37:32 PM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if(n<=0) return false;
4        double val = (double)n;
5        double dif = 0;
6        while(val>1.0){
7            val/=4.0;
8            dif = val-Math.floor(val);
9            if(dif>0.0) return false;
10        }
11        return true;
12    }
13}