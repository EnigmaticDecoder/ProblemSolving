// Last updated: 2/10/2026, 3:28:36 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
       if (n <= 0) return false;
       return (n & (n - 1)) == 0;
}
}