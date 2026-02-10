// Last updated: 2/10/2026, 3:27:44 PM
class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int len = binary.length();
        int slow = 0;
        int distance = 0;
        for(int i = 0; i<len; i++){
            if(binary.charAt(i) != '1') continue;
            else {
                if((i-slow)>distance) distance = i-slow;
                slow = i;
            }
        }
        return distance;
    }
}