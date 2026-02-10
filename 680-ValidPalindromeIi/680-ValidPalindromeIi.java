// Last updated: 2/10/2026, 3:27:55 PM
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return ispal(s, left + 1, right) 
                    || ispal(s, left, right - 1);
            }
        }
        return true;
    }

    boolean ispal(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}