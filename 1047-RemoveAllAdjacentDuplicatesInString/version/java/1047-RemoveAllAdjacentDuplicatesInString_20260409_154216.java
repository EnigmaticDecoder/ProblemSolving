// Last updated: 4/9/2026, 3:42:16 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        StringBuilder sb = new StringBuilder();
4        int n = s.length();
5        Stack<Character> st = new Stack<>();
6        int i;
7        for(i = 0; i<n; i++){
8            int count = 0;
9            while(!st.empty() && st.peek()==s.charAt(i)){
10                st.pop();
11                count++;
12            }
13            if(count>0) continue;
14            st.push(s.charAt(i));
15        }
16        while(!st.empty()){
17            sb.append(st.pop());
18        }
19         
20        return sb.reverse().toString();
21
22    }
23}