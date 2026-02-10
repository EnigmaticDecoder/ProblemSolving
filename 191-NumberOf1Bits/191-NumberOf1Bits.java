// Last updated: 2/10/2026, 3:28:45 PM
class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        while(n!=0){
            int digit = n%2;
            if(digit == 1) ans++;
            n/=2;
        }
        return ans;
    }
}