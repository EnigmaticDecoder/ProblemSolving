// Last updated: 3/2/2026, 11:05:29 PM
// Iterative method of solving fibonacci number problem
1class Solution {
2    public int fib(int n) {
3        int t1 = 0;
4        int t2 = 1;
5        int sum = 0;
6        if(n<=1) return n;
7        for(int i=2; i<=n; i++){
8            sum=t1+t2;
9            t1=t2;
10            t2=sum;
11        }
12        return sum;
13    }
14}