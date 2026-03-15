// Last updated: 3/15/2026, 8:41:11 AM
1class Solution {
2    public long countCommas(long n) {
3        long value = n;
4        long ans = 0;
5        long start = 1000;
6        int commas = 1;
7        while (start <= value) {
8            long end = start * 1000 - 1;
9            long count = Math.min(value, end) - start + 1;
10            ans += count * commas;
11            start *= 1000;
12            commas++;
13        }
14        return ans;
15    }
16}