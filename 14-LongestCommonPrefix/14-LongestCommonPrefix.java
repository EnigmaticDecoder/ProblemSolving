// Last updated: 2/10/2026, 3:29:31 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        outer:
        for (int j = 0; j < strs[0].length(); j++) {
            char temp = strs[0].charAt(j);
            for (String str : strs) {
                if (j >= str.length() || str.charAt(j) != temp) {
                    break outer;
                }
            }
            output += temp;
        }
        return output;
    }
}

