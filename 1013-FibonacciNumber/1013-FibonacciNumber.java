// Last updated: 3/24/2026, 2:24:28 PM
class Solution {
    public int fib(int n) {
        int t1 = 0;
        int t2 = 1;
        int sum = 0;
        if(n<=1) return n;
        for(int i=2; i<=n; i++){
            sum=t1+t2;
            t1=t2;
            t2=sum;
        }
        return sum;
    }
}