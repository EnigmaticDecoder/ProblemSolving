// Last updated: 2/10/2026, 3:27:07 PM
class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        int a = 1;
        long sum = 0;
        while(n>0){
            int digit = n%10;
            if(digit!=0){
                x = x + (digit)*(a*1);
                sum += digit;
                a*=10;
            }
            n/=10;
        }
        return sum*x;
    }
}