// Last updated: 2/10/2026, 3:27:21 PM
class Solution {
    public boolean equalFrequency(String word) {
        int freq[] = new int [26];
        for(char c : word.toCharArray()){
            freq[c-'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            freq[i]--; 
            int same = 0;
            boolean valid = true;
            for (int f : freq) {
                if (f == 0) continue;
                if (same == 0) same = f;
                else if (f != same) {
                    valid = false;
                    break;
                }
            }
            freq[i]++;
            if (valid) return true;
        }
        return false;
    }
}