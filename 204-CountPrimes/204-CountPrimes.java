// Last updated: 2/10/2026, 3:28:42 PM
class Solution {
    public int countPrimes(int n) {
        if( n == 0||n==1||n==2) return 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n-1; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        int count = 0;
        for (boolean value: isPrime){
            if(value){
                count++;
            }
        }
        return count;
    }
}