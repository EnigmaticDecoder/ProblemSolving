// Last updated: 3/7/2026, 9:24:26 PM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int prev = 0;
4        int curr = 1;
5        int result = 0;
6        for (int i = 1; i < s.length(); i++) {
7            if (s.charAt(i) == s.charAt(i - 1)) {
8                curr++;
9            } else {
10                prev = curr;
11                curr = 1;
12            }
13            if (prev >= curr) result++;
14        }
15        return result;
16    }
17}