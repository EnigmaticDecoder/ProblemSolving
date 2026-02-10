// Last updated: 2/10/2026, 3:27:18 PM
class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0;

        while(n>0){
            int digit = n%10;
            n /= 10;
            if(num%digit == 0) count++;
        }
        return count;
    }
}