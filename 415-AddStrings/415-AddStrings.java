// Last updated: 2/10/2026, 3:28:11 PM
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sum = new StringBuilder();
        while (i >=0|| j >= 0 || carry!= 0) {
            int digitA = (i >= 0)?num1.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int total = digitA + digitB + carry;
            sum.append(total % 10);
            carry = total / 10;
            i--;
            j--;
        }
        return sum.reverse().toString();
    }
}