// Last updated: 3/2/2026, 10:58:00 PM
1class Solution {
2    public int fib(int n) {
3        if(n<=1) return n;
4        return fib(n-1) + fib(n-2);
5    }
6}