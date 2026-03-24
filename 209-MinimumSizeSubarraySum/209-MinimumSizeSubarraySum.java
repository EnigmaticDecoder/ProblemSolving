// Last updated: 3/24/2026, 2:25:04 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int min = n+1;
        int l = 0;
        int r = 0;
        for(int i = 0; i<n; i++){
            sum+=nums[i];
            while(sum>=target){
                min = Math.min(min,i-l+1);
                sum-=nums[l++];
            }
        }
        if(min == n+1) return 0;
        else return min;
    }
}
