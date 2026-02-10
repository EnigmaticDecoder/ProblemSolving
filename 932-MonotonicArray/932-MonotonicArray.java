// Last updated: 2/10/2026, 3:27:37 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length-1;
        int counti = 0;
        int countd = 0;
        boolean change = false;
        for(int i = 0; i<n; i++){
            if(nums[i+1]>=nums[i]) counti++;
            if(nums[i+1]<=nums[i]) countd++;
        }

        if((counti == n || countd == n )) return true;
        else return false;
    }
}