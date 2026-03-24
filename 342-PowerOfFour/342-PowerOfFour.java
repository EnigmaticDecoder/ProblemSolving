// Last updated: 3/24/2026, 2:24:52 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        double val = (double)n;
        double dif = 0;
        while(val>1.0){
            val/=4.0;
            dif = val-Math.floor(val);
            if(dif>0.0) return false;
        }
        return true;
    }
}