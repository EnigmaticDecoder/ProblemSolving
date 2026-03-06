// Last updated: 3/6/2026, 8:05:41 AM
1class Solution {
2    public boolean checkOnesSegment(String s) {
3        int n = s.length();
4        if((n==1) && (s.charAt(0)=='1')) return true;
5        boolean flag = true;
6        for(int i = 0; i<n-1; i++){
7            if(!(flag && ((s.charAt(i)=='1') && (s.charAt(i+1))=='1')))
8            flag = false;
9            if(!flag){
10                if(s.charAt(i+1)=='1') return false;
11            }
12        }
13        return true;
14    }
15}// the question is a bit confusing therefore see to it. Understand what it says clearly then proceed
16