// Last updated: 3/24/2026, 2:24:13 PM
class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        if((n==1) && (s.charAt(0)=='1')) return true;
        boolean flag = true;
        for(int i = 0; i<n-1; i++){
            if(!(flag && ((s.charAt(i)=='1') && (s.charAt(i+1))=='1')))
            flag = false;
            if(!flag){
                if(s.charAt(i+1)=='1') return false;
            }
        }
        return true;
    }
}// the question is a bit confusing therefore see to it. Understand what it says clearly then proceed
