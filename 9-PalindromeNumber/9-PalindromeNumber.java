// Last updated: 2/10/2026, 3:29:37 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int ori = x;
        int rev = 0;
        while(x > 0) {
            rev = rev * 10 + x%10;
            x = x/10;
        }

        if(rev == ori) {
            return true;
        }
        else {
            return false;
        }
    }
}