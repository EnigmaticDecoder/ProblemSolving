// Last updated: 2/27/2026, 12:08:45 AM
// optimal
1class Solution {
2    public int numSteps(String s) {
3        int step = 0;
4        int carry = 0;
5        for (int i = s.length() - 1; i > 0; i--) {
6            int bit = s.charAt(i) - '0';
7            if (bit + carry == 1) {
8                step += 2;
9                carry = 1;
10            } else {
11                step += 1;
12            }
13        }
14        return step + carry;
15    }
16}