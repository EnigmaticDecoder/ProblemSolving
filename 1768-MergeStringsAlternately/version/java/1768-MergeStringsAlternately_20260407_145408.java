// Last updated: 4/7/2026, 2:54:08 PM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5        int len = n>m?m:n;
6        int a = 0;
7        int b = 0;
8        String str = "";
9        while(len-->0){
10            str+= word1.charAt(a++);
11            str+= word2.charAt(b++);
12        }
13
14        if(n==m) return str;
15        else if(n>m){
16           return str += word1.substring(a);
17        } else  return str += word2.substring(b);
18
19    }
20}