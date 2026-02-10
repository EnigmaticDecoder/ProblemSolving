// Last updated: 2/10/2026, 3:28:30 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i = 0; i<n; i++){
            sum+=nums[i];
        }
        return (n*(n+1))/2-sum;
    }
}