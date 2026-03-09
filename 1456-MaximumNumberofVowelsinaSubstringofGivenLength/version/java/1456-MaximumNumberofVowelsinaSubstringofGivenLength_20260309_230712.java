// Last updated: 3/9/2026, 11:07:12 PM
1class Solution {
2    public int maxVowels(String s, int k) {
3        Set<Character> set = new HashSet<>();
4        set.add('a');
5        set.add('e');
6        set.add('i');
7        set.add('o');
8        set.add('u');
9        int n = s.length();
10        int count = 0;
11        int result = 0;
12        int j=0;
13        for(int i = 0; i<n; i++){
14            if(i<k){
15                if(set.contains(s.charAt(i))){
16                    count++;
17                }
18                result = count;
19                continue;
20            }
21            if(set.contains(s.charAt(j))) count--;
22            if(set.contains(s.charAt(i))) count++;
23            if(count>result) result = count;
24            j++;
25        }
26        return result;
27    }
28}