// Last updated: 2/10/2026, 3:27:05 PM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length;
        int max = -101;
        int max1 = -101;
        int min = 101;
        int idx = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]>max) {max = nums[i]; idx = i;}
            if(nums[i]<min) min = nums[i];
        }
        nums[idx] = -101;
        for(int i = 0; i<n; i++){
            if(nums[i]>max1) {max1 = nums[i];}
        }
        return max1+max-min;
    }
}
// This snippet assumed that largest value appear at the last and second couldn't come later.