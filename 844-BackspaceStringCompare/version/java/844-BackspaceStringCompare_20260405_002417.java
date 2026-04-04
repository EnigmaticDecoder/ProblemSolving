// Last updated: 4/5/2026, 12:24:17 AM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5        int count = 0;
6        String news = " ";
7        String newt = " ";
8        for(int i = n-1; i>=0; i--){
9            if(s.charAt(i)=='#') {count++; continue;}
10            if(count>0) {count--;continue;}
11            news+=s.charAt(i);
12        }
13        count = 0;
14         for(int i = m-1; i>=0; i--){
15            if(t.charAt(i)=='#') {count++; continue;}
16            if(count>0) {count--;continue;}
17            newt+=t.charAt(i);
18        }
19        System.out.println(news);
20        System.out.println(newt);
21        if(newt.equals(news)) return true;
22        else return false;
23    }
24}