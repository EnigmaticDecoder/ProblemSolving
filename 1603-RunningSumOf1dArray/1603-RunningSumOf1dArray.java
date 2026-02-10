// Last updated: 2/10/2026, 3:27:27 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += nums[i];
            nums[i] = sum;
        }   
        return nums;
    }
}