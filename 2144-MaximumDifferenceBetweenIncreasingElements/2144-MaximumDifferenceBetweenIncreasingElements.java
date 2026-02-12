// Last updated: 2/12/2026, 6:56:03 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = -1;
        for(int i = 0; i<n; i++){
            if(nums[i]>min){
                int diff = nums[i]- min;
                max = Math.max(max,diff);
            }
            else {
                min = nums[i];
            }
        }
        return max;
    }
}