// Last updated: 2/28/2026, 7:30:35 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n<=0) return false;
4        double val = (double)n;
5        double dif = 0;
6        while(val>1.0){
7            val/=3.0;
8            dif = val-Math.floor(val);
9            if(dif>0.0) return false;
10        }
11        return true;
12    }
13}