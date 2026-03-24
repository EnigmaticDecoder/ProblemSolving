// Last updated: 3/24/2026, 2:24:20 PM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        int n = s.length();
        for(int i = 0; i<=n-k; i++){
            String str = "";
            // set.add(s.substring(i, i + k));
            int j = i;
            while(j<i+k && j<n){
                str+=s.charAt(j);
                j++;
            }
            set.add(str);
    }
    if(set.size() == Math.pow(2,k)) return true;
    else return false;
    }
}