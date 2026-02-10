// Last updated: 2/10/2026, 3:28:53 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String str = "";
        while(columnNumber>26){
            columnNumber--;
            int digit = columnNumber%26;
            char charDigit = (char) (digit+'A');
            str = charDigit + str;
            columnNumber  = (columnNumber/26);
        }
        columnNumber--;
        char charDigit = (char) (columnNumber+'A');
            str = charDigit + str;
        return str;
    }
}