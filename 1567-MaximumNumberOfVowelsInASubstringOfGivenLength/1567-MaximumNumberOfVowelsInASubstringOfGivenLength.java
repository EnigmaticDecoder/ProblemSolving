// Last updated: 3/24/2026, 2:24:19 PM
class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int n = s.length();
        int count = 0;
        int result = 0;
        int j=0;
        for(int i = 0; i<n; i++){
            if(i<k){
                if(set.contains(s.charAt(i))){
                    count++;
                }
                result = count;
                continue;
            }
            if(set.contains(s.charAt(j))) count--;
            if(set.contains(s.charAt(i))) count++;
            if(count>result) result = count;
            j++;
        }
        return result;
    }
}