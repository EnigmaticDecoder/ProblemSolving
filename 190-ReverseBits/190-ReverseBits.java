// Last updated: 2/10/2026, 3:28:47 PM
class Solution {
    public int reverseBits(int n) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        while(n>0){
            int digit = n%2;
            num.add(digit);
            n /=2;
        }
        int len = num.size()-1;
        int diff = 31-len;
        for(int i = 0; i<diff; i++){
            num.add(0);
        }
        len = num.size()-1;
        int number = 0;
        int a = 0;
        for(int i = len; i>=0; i--){
            number = number + num.get(i)*(int)(Math.pow(2,a++));
        }
        return number;
    }
}