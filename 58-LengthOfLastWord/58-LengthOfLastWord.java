// Last updated: 2/10/2026, 3:29:14 PM
class Solution {
    public int lengthOfLastWord(String s) {
                s = s.trim(); // remove trailing spaces
        int lastSpace = s.lastIndexOf(" "); 
        return s.length() - lastSpace - 1; 

    }
}