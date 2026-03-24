// Last updated: 3/24/2026, 2:24:38 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        double avg = 0;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(i<k){
                sum+=nums[i];
                avg = (double)sum/k;
                continue;
            }
            sum-=nums[j];
            sum+=nums[i];
            j++;
            if(avg < (double)sum/k){
                avg = (double)sum/k;
            }
        }
        return avg;
    }
}