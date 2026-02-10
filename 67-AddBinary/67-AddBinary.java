// Last updated: 2/10/2026, 3:29:11 PM
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sum = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int total = digitA + digitB + carry;
            sum.append(total % 2);
            carry = total / 2;
            i--;
            j--;
        }
        return sum.reverse().toString();
    }
}