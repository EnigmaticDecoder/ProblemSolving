// Last updated: 2/10/2026, 3:28:25 PM
class Solution {
    public String reverseVowels(String s) {
     int n = s.length();
     Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
     StringBuilder str = new StringBuilder();
     int left = 0;
     int right = n-1;
     while(left<n){
        if(!set.contains(s.charAt(left))){
            str.append(s.charAt(left));
            left++;
        }
        else if(!set.contains(s.charAt(right))){
            right--;
        }
        else {
            str.append(s.charAt(right));
            left++;
            right--;
        }
     }
     return str.toString();
    }
}