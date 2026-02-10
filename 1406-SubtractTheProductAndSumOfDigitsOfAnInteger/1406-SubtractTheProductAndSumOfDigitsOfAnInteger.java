// Last updated: 2/10/2026, 3:27:30 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            prod*=digit;
            sum+=digit;
            n/=10;
        }
        return prod-sum;
    }
}