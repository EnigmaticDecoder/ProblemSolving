// Last updated: 2/10/2026, 3:28:03 PM
class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int n = num;
        num = Math.abs(num);
        while(num!=0){
            int digit = num%7;
            sb.append(String.valueOf(digit));
            num/=7;
        }
        if(n<0) sb.append("-");
        sb.reverse();
        String ans = sb.toString();
        return ans;
    }
}