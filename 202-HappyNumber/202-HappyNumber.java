// Last updated: 2/10/2026, 3:28:44 PM
class Solution {
    
    public boolean isHappy(int n) {
        if(n == 1 || n == 7) return true;
        boolean condition = true;
        Set<Integer> set = new HashSet<>();
        int num = n;
        while(condition){
            int sum = 0;
             while(num!=0){
                 sum += (num%10)*(num%10);
                 num /= 10;
                }
                if(sum == 1) return true;
                num = sum;
                condition  = set.add(sum);
        }
        return false;

    }

}