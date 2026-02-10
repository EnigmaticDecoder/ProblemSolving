// Last updated: 2/10/2026, 3:28:09 PM
class Solution {
    public int countSegments(String s) {
        String str = s.trim();
        if(str.equals("")) return 0;
        int count = 1;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i) ==' ' && str.charAt(i+1) !=' ' ) count++;
        }
        return count;
    }
}