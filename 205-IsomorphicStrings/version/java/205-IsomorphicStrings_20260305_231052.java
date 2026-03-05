// Last updated: 3/5/2026, 11:10:52 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        HashMap<Character, Character> map = new HashMap<>();
4        HashSet<Character> set = new HashSet<>();
5        for(int i = 0; i < s.length(); i++){
6            char ch1 = s.charAt(i);
7            char ch2= t.charAt(i);  
8            if(map.containsKey(ch1)){
9                if(map.get(ch1) != ch2) return false;
10            } else {
11                if(set.contains(ch2)) return false;
12                map.put(ch1, ch2);
13                set.add(ch2);
14            }
15        }
16        return true;
17    }
18}