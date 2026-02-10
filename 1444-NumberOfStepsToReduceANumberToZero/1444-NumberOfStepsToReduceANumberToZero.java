// Last updated: 2/10/2026, 3:27:28 PM
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num!=0){
            if(num%2==0) num /=2;
            else num -=1;
            count++;
        }
        return count;
    }
}