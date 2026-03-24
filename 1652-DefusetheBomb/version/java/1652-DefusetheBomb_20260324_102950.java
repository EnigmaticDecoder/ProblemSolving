// Last updated: 3/24/2026, 10:29:50 AM
1class Solution {
2    public int[] decrypt(int[] code, int k) {
3        int n = code.length;
4        int[] res = new int[n];
5        if (k == 0) return res;
6        for (int i = 0; i < n; i++) {
7            int sum = 0;
8            if (k > 0) {
9                for (int j = 1; j <= k; j++) {
10                    sum += code[(i + j) % n];
11                }
12            } else {
13                for (int j = 1; j <= -k; j++) {
14                    sum += code[(i - j + n) % n];
15                }
16            }
17            
18            res[i] = sum;
19        }
20        
21        return res;
22    }
23}