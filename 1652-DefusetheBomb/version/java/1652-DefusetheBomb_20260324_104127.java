// Last updated: 3/24/2026, 10:41:27 AM
// Optimal solution using two pointer
1class Solution {
2    public int[] decrypt(int[] code, int k) {
3        int n = code.length;
4        int[] ans = new int[n];
5        if (k == 0) return ans;
6        int sum = 0;
7        int start = 0;
8        int end = 0;
9        if (k > 0) {
10            start = 1;
11            end = k;
12        } else {
13            // In this case k is -ve therefore, I am starting start from k place before k.
14            start = n + k;
15            end = n - 1;
16        }
17        for (int i = start; i <= end; i++) {
18            sum += code[i % n];
19        }
20        for (int i = 0; i < n; i++) {
21            ans[i] = sum;
22            sum -= code[start % n];
23            start++;
24            end++;
25            sum += code[end % n];
26        }
27
28        return ans;
29    }
30}