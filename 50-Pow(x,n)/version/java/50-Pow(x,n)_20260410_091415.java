// Last updated: 4/10/2026, 9:14:15 AM
1class Solution {
2    public double myPow(double x, int n) {
3        long N = n;
4        if (N < 0) {
5            x = 1 / x;
6            N = -N;
7        }
8        return power(x, N);
9    }
10    double power(double x, long n) {
11        if (n == 0) return 1;
12        double half = power(x, n / 2);
13        if (n % 2 == 0) {
14            return half * half;
15        } else {
16            return half * half * x;
17        }
18    }
19}