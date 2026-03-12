// Last updated: 3/12/2026, 10:39:51 AM
// Optimized solution using sliding window.
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        int n = s.length();
4        int m = p.length();
5        int pl[] = new int[26];
6        int sl[] = new int[26];
7        ArrayList<Integer> list = new ArrayList<>();
8        for(int i = 0; i<m; i++){
9            pl[p.charAt(i)-'a']++;
10        }
11        
12        for(int i = 0; i<n; i++){
13            if(i<m) sl[s.charAt(i)-'a']++;
14            if(i>=m) {
15                sl[s.charAt(i-m)-'a']--;
16                sl[s.charAt(i)-'a']++;
17            }
18            boolean flag = true;
19            for(int j = 0; j<26; j++){
20                if(pl[j]!=sl[j]) flag = false;
21            }
22            if(flag) list.add(i-m+1);
23        }
24        return list;
25    }
26}