// Last updated: 2/10/2026, 3:27:24 PM
class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int max = 0;
        int min = 1001;
        for(int i = 0; i<n; i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        return gdc(max,min);
    }
    int gdc(int max, int min){
        while(min!=0){
            int r = max%min;
            max = min;
            min = r;
        }
        return max;
    }
}