// Last updated: 2/10/2026, 3:28:27 PM
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<=end){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }   
    }
}