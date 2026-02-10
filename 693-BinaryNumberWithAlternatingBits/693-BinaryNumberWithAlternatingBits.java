// Last updated: 2/10/2026, 3:27:54 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n^(n>>1);
        return (x&(x+1)) == 0;
    }
}