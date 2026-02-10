// Last updated: 2/10/2026, 3:27:57 PM
class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'A') countA++;
        }
        if(s.contains("LLL") || countA>=2) return false;
        else
        return true;
    }
}