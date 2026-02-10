// Last updated: 2/10/2026, 3:28:14 PM
class Solution {
    public int longestPalindrome(String s) {
       int[] hash = new int[123];
       for(char c : s.toCharArray()){
        hash[c] += 1; 
       }
       boolean odd = false;
       int length = 0;
       for(int num : hash){
        if(num%2==0) length+=num;
        else {odd=true;length+=num-1;}
       }
       if(odd) return length+1;
       else       return length;
     }
}