// Last updated: 2/10/2026, 3:28:00 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))) count++;
        }
        if((count == 1 && Character.isUpperCase(word.charAt(0))) || count == word.length() || count==0) return true;
        else return false;
  }
}