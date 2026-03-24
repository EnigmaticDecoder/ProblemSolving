// Last updated: 3/24/2026, 2:23:56 PM
class Solution {
    public long countCommas(long n) {
        long value = n;
        long ans = 0;
        long start = 1000;
        int commas = 1;
        while (start <= value) {
            long end = start * 1000 - 1;
            long count = Math.min(value, end) - start + 1;
            ans += count * commas;
            start *= 1000;
            commas++;
        }
        return ans;
    }
}