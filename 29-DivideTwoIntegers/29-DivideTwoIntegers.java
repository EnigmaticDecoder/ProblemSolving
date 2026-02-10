// Last updated: 2/10/2026, 3:29:20 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean check = (dividend >= 0) == (divisor >= 0);
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;
        while (dvd >= dvs) {
            int shift = 0;
            while (dvd >= (dvs << (shift + 1))) {
                shift++;
            }
            result += 1 << shift;
            dvd -= dvs << shift;
        }
        return check ? result : -result;
    }
}