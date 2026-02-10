// Last updated: 2/10/2026, 3:29:22 PM
class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String substr = haystack.substring(i, i + needle.length());
            if (substr.equals(needle))
                return i;
        }
        return -1;
    }
}

