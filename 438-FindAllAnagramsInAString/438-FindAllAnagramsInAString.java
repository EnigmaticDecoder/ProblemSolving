// Last updated: 3/24/2026, 2:24:43 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        int pl[] = new int[26];
        int sl[] = new int[26];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<m; i++){
            pl[p.charAt(i)-'a']++;
        }
        
        for(int i = 0; i<n; i++){
            if(i<m) sl[s.charAt(i)-'a']++;
            if(i>=m) {
                sl[s.charAt(i-m)-'a']--;
                sl[s.charAt(i)-'a']++;
            }
            boolean flag = true;
            for(int j = 0; j<26; j++){
                if(pl[j]!=sl[j]) flag = false;
            }
            if(flag) list.add(i-m+1);
        }
        return list;
    }
}