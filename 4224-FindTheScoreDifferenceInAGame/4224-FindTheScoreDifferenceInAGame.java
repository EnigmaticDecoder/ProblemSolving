// Last updated: 3/24/2026, 2:24:00 PM
class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;
        int player1 = 0;
        int player2 = 0;
        boolean flag = true;
        for(int i = 0; i<n; i++){
            if(nums[i]%2==1) flag = !flag;
            if(i%6==5) flag = !flag;
            if(flag) player1+=nums[i];
            else player2+= nums[i];
        }
        return player1-player2;
    }
}