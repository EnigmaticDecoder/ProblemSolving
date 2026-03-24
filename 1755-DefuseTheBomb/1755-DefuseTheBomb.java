// Last updated: 3/24/2026, 2:24:15 PM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0) return ans;
        int sum = 0;
        int start = 0;
        int end = 0;
        if (k > 0) {
            start = 1;
            end = k;
        } else {
            // In this case k is -ve therefore, I am starting start from k place before k.
            start = n + k;
            end = n - 1;
        }
        for (int i = start; i <= end; i++) {
            sum += code[i % n];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = sum;
            sum -= code[start % n];
            start++;
            end++;
            sum += code[end % n];
        }

        return ans;
    }
}