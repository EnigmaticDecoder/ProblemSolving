// Last updated: 2/10/2026, 3:27:04 PM
class Solution {
    public int minimumFlips(int n) {
        String str = Integer.toBinaryString(n);
        int start = 0;
        int end = str.length()-1;
        int flip = 0;
        while(start<=end){
            if(str.charAt(start) != str.charAt(end)) flip = flip + 2;
            start++;
            end--;
        }
            return flip;
    }
}
