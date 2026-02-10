// Last updated: 2/10/2026, 3:27:02 PM

class Solution {
    public static int findClosest(int x, int y, int z) {
        int n = Math.abs(x-z);
        int m = Math.abs(y-z);
        if(n>m)
            return 2;
        if(n<m)
            return 1;
        return 0;
    }

}