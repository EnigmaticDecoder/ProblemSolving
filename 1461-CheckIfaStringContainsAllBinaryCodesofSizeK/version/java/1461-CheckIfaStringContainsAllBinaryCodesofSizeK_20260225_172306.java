// Last updated: 2/25/2026, 5:23:06 PM
1class Solution {
2    public boolean hasAllCodes(String s, int k) {
3        HashSet<String> set = new HashSet<>();
4        int n = s.length();
5        for(int i = 0; i<=n-k; i++){
6            String str = "";
7            // set.add(s.substring(i, i + k));
8            int j = i;
9            while(j<i+k && j<n){
10                str+=s.charAt(j);
11                j++;
12            }
13            set.add(str);
14    }
15    if(set.size() == Math.pow(2,k)) return true;
16    else return false;
17    }
18}